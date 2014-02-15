// MFCbrowserView.cpp : implementation of the CMFCbrowserView class
//

#include "stdafx.h"
#include "MFCbrowser.h"

#include "MFCbrowserDoc.h"
#include "MFCbrowserView.h"
#include <mshtmdid.h>

#include "URLDlg.h"

#include <iostream>



#ifdef _DEBUG
#define new DEBUG_NEW
#endif

#define TIMER_CRAWLER 100

// CMFCbrowserView

IMPLEMENT_DYNCREATE(CMFCbrowserView, CHtmlView)

BEGIN_MESSAGE_MAP(CMFCbrowserView, CHtmlView)
	// Standard printing commands
	ON_COMMAND(ID_FILE_PRINT, CHtmlView::OnFilePrint)
	ON_COMMAND(ID_VIPS_NAVIGATEURL, OnVipsNavigateurl)
	ON_COMMAND(ID_VIPS_PROCESSLIST, OnVipsProcesslist)
END_MESSAGE_MAP()

// CMFCbrowserView construction/destruction


//You should initialize the VIPS analyzer before using.
CMFCbrowserView::CMFCbrowserView():m_bNavigateError(FALSE)
		,m_ProcessType(_DEFAULT_)
		,m_pFileList(NULL),m_pFileLog(NULL),m_pDestPath(NULL),m_fLog(NULL)
		,m_iEndDocID(0)
		,m_iBlockID(0)
{
	HRESULT hr;
	hr = m_pLayoutAnalyzer.CreateInstance(CLSID_LayoutAnalyzer2);
	//assert(SUCCEEDED(hr));
	//_ASSERT(SUCCEEDED(hr));
	if(SUCCEEDED(hr))
		m_pLayoutAnalyzer->Initialize(0);
	else
		AfxMessageBox("PageAnalyzer not found!");


}

CMFCbrowserView::~CMFCbrowserView()
{

	if(m_pFileList)
		delete m_pFileList;

	if(m_pFileLog)
		delete m_pFileLog;

	if(m_fLog){
		fclose(m_fLog);
		m_fLog = NULL;
	}

	if(m_pDestPath){
		delete[] m_pDestPath;
		m_pDestPath = NULL;
	}


}

BOOL CMFCbrowserView::PreCreateWindow(CREATESTRUCT& cs)
{
	// TODO: Modify the Window class or styles here by modifying
	//  the CREATESTRUCT cs

	return CHtmlView::PreCreateWindow(cs);
}

void CMFCbrowserView::OnInitialUpdate()
{
	CHtmlView::OnInitialUpdate();
	Navigate2(_T("about:blank"),NULL,NULL);
	m_bBlankPage = TRUE;
}


// CMFCbrowserView printing



// CMFCbrowserView diagnostics

#ifdef _DEBUG
void CMFCbrowserView::AssertValid() const
{
	CHtmlView::AssertValid();
}

void CMFCbrowserView::Dump(CDumpContext& dc) const
{
	CHtmlView::Dump(dc);
}

CMFCbrowserDoc* CMFCbrowserView::GetDocument() const // non-debug version is inline
{
	ASSERT(m_pDocument->IsKindOf(RUNTIME_CLASS(CMFCbrowserDoc)));
	return (CMFCbrowserDoc*)m_pDocument;
}
#endif //_DEBUG


// CMFCbrowserView message handlers

//You can control the hosted webbrowser's behavior here, like download the image, enable scripts...
//Please see MSDN for detail description
//Now the setting is No picture downloading, no scripts....
BOOL CMFCbrowserView::OnAmbientProperty(COleControlSite* pSite, DISPID dispid, VARIANT* pvar)
{

	USES_CONVERSION;

	switch (dispid)
	{

	case DISPID_AMBIENT_DLCONTROL:
		pvar->vt = VT_I4;
		pvar->lVal = DLCTL_NO_SCRIPTS | DLCTL_NO_JAVA
			| DLCTL_NO_RUNACTIVEXCTLS | DLCTL_NO_DLACTIVEXCTLS
			|DLCTL_NO_FRAMEDOWNLOAD|DLCTL_NO_CLIENTPULL|DLCTL_SILENT|DLCTL_NO_BEHAVIORS
			| DLCTL_OFFLINE;

		return TRUE;
	}

	return CHtmlView::OnAmbientProperty(pSite, dispid, pvar);
}



//Everytime the bowser completed loading the page, it will triger this function
//See MSDN for more detail
//You should put your code here to process batch job
void CMFCbrowserView::DocumentComplete(LPDISPATCH pDisp, VARIANT* URL)
{
	UNUSED_ALWAYS(pDisp);
	ASSERT(V_VT(URL) == VT_BSTR);

	if(m_bBlankPage){
		m_bBlankPage = FALSE;
		return;
	}

	LPDISPATCH lpWBDisp;
	HRESULT    hr;

	hr = m_pBrowserApp->QueryInterface(IID_IDispatch, (void**)&lpWBDisp);
	ASSERT(SUCCEEDED(hr));

	IDispatch* pVoid = NULL;

	if (pDisp == lpWBDisp )
	{
		switch(m_ProcessType) {
		case _ANALYZELIST_STREAM_:
			AnalyzeListItem();
			NextListItem();
		case _ANALYZELIST_:
			AnalyzeListItem();
			NextListItem();
		case _ONEPAGE_:
			m_pBrowserApp->get_Document(&pVoid);
			m_pLayoutAnalyzer->Analyze4(pVoid, _variant_t(5L));
			pVoid->Release();
			if(TRUE){
				MSXML2::IXMLDOMDocumentPtr pFOMPage = m_pLayoutAnalyzer->GetFOMPage();
				pFOMPage->save("c:\\test.xml");
			}
			break;
		case _ONEPAGE_TEXT:
			m_pBrowserApp->get_Document(&pVoid);
			m_pLayoutAnalyzer->AnalyzeOutputAll_Text(pVoid, _variant_t(5L));
			pVoid->Release();
			if(TRUE){
				_bstr_t strResult = m_pLayoutAnalyzer->getResult();
				std::cout << (char*)strResult << std::endl;
				FILE* ftmp = fopen("c:\\VIPSresult.txt","w");
				if(ftmp){
					fprintf(ftmp,"%s",(char*)strResult);
					fclose(ftmp);
				}
			}
			break;
		}

	}

	lpWBDisp->Release();

}

void CMFCbrowserView::OnNavigateError(LPCTSTR lpszURL, LPCTSTR lpszFrame, DWORD dwError, BOOL *pbCancel)
{

	m_bNavigateError = TRUE;

}


void CMFCbrowserView::OnVipsNavigateurl()
{

	CDlgUrl Dlg;
	if(Dlg.DoModal()==IDOK)
	{
		if(Dlg.m_bAnalyzeOutputAll)
			m_ProcessType = _ONEPAGE_;
		else
			m_ProcessType = _DEFAULT_;

		if(Dlg.m_bAnalyzeOutputAllText)
			m_ProcessType = _ONEPAGE_TEXT;

		Navigate2(Dlg.m_strUrl,NULL,NULL);
	}
}

//////////////////////////////////
//Process one directory 
//////////////////////////////////

void CMFCbrowserView::OnVipsProcesslist()
{
	m_ProcessType = _ANALYZELIST_;
	//m_ProcessType = _ANALYZELIST_STREAM_;

	if(m_pFileList)
		delete m_pFileList;

	if(m_pFileLog)
		delete m_pFileLog;

	m_strDesDir="OutputAll\\XML\\";

	m_pFileList = new CStdioFile("OutputAll\\Htmllist",CFile::modeRead|CFile::shareDenyWrite);
	m_pFileLog = new CStdioFile("OutputAll\\log.txt",CFile::modeWrite|CFile::modeCreate|CFile::modeNoTruncate|CFile::shareDenyWrite);
	if(m_pFileList == NULL){
		MessageBox("Failed to open list file");
		return;
	}
	if(m_pFileLog == NULL){
		MessageBox("Failed to create log file");
		return;
	}
	m_iLineNum = -1;

	NextListItem();
    //NextListItem_Stream();
}

//This is one way to do batch job. When you only have a list of urls or file names,
//you want the browser load the page and analyze them
void CMFCbrowserView::NextListItem()
{
	if(!m_pFileList->ReadString(m_strLine)){
		MessageBox("Process Completed!");
		return;
	}
	m_iLineNum ++;

	CString strHtml = m_strLine;
	Navigate2(strHtml,NULL,NULL);        
}

//This is another way to do batch job. When you store all the files in one place and your own code
//will handle the file reading, you only want pass the browser a stream.
//See MSDN for more details
void CMFCbrowserView::NextListItem_Stream()
{
	if(!m_pFileList->ReadString(m_strLine)){
		MessageBox("Process Completed!");
		return;
	}
	m_iLineNum ++;

	CString strHtml = m_strLine;

	FILE* stream = NULL;
	if( (stream  = fopen( strHtml, "rb" )) == NULL ){
		MessageBox( "The file can not be opened" );
		return;
	}

	int result = fseek(stream,0L,SEEK_END);
	long size = ftell(stream);

	HGLOBAL hHTMLText = NULL;
	hHTMLText = GlobalAlloc( GPTR, size);

	if ( hHTMLText )
	{
		//memcpy(hHTMLText,buffer,size);
		fread(hHTMLText,sizeof(char),size,stream);
		fclose(stream);

		HRESULT hr;
		IStream* pStream = NULL;

		hr = CreateStreamOnHGlobal( hHTMLText, TRUE, &pStream );
		if ( SUCCEEDED(hr) )
		{
			// Call the helper function to load the Web Browser from the stream.
			IDispatch* pHtmlDoc = NULL;
			IPersistStreamInit* pPersistStreamInit = NULL;

			// Retrieve the document object.
			hr = m_pBrowserApp->get_Document( &pHtmlDoc );
			if ( SUCCEEDED(hr) )
			{
				// Query for IPersistStreamInit.
				hr = pHtmlDoc->QueryInterface( IID_IPersistStreamInit,  (void**)&pPersistStreamInit );
				pHtmlDoc->Release();
				if ( SUCCEEDED(hr) )
				{
					// Initialize the document.
					hr = pPersistStreamInit->InitNew();
					if ( SUCCEEDED(hr) )
					{
						// Load the contents of the stream.
						hr = pPersistStreamInit->Load( pStream );
					}
					pPersistStreamInit->Release();
				}
			}

			pStream->Release();
		}

		//GlobalFree( hHTMLText );
	}else{
		fclose(stream);
	}

}

void CMFCbrowserView::AnalyzeListItem()
{
	IDispatch* pVoid;
	m_pBrowserApp->get_Document(&pVoid);
	m_pLayoutAnalyzer->Analyze4(pVoid, _variant_t(5L));
	pVoid->Release();

	MSXML2::IXMLDOMDocumentPtr pFOMPage = m_pLayoutAnalyzer->GetFOMPage();


	CString strName;
	strName.Format("%s%d.xml",m_strDesDir,m_iLineNum);

	_variant_t path = strName;

	pFOMPage->save(path);	
	m_pFileLog->WriteString(strName);
	m_pFileLog->WriteString("\t");
    m_pFileLog->WriteString(m_strLine);
	m_pFileLog->WriteString("\n");
	m_pFileLog->Flush();
}

