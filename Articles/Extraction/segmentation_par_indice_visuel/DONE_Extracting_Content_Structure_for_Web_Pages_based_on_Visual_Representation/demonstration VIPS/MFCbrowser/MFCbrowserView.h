// MFCbrowserView.h : interface of the CMFCbrowserView class
//


#pragma once

//you should copy the following line into your own codes to import the vips dll

#import <MSHTML.TLB>
#import <MSXML3.DLL>
#import "..\..\Common\lib\public_interface\PageAnalyzer.dll"  /*named_guids*/

// Define the CLSID of coclasses
extern "C" const GUID __declspec(selectany) LIBID_PAGEANALYZERLib =
{0xa120e7cc,0x6971,0x43a8,{0x93,0xcd,0xda,0x67,0x15,0x1b,0x63,0x17}};
extern "C" const GUID __declspec(selectany) CLSID_LayoutAnalyzer2 =
{0xa0205d6d,0x1674,0x4664,{0xb0,0x4f,0x8d,0x28,0x6d,0x5f,0xa9,0x91}};



class CMFCbrowserView : public CHtmlView
{
public:

    //define the VIPS analyzer
	PAGEANALYZERLib::ILayoutAnalyzer2Ptr m_pLayoutAnalyzer;
	
	BOOL m_bNavigateError;
	BOOL m_bBlankPage;

	enum{_DEFAULT_
		,_ONEPAGE_
		,_ONEPAGE_TEXT
		,_ANALYZELIST_
		,_ANALYZELIST_STREAM_
	} m_ProcessType;

	FILE* m_fLog;			//the file to log the segmentation process 
	_TCHAR *m_pDestPath;
	int	  m_iEndDocID;

	CString m_strSouDir;
	CString m_strDesDir;
	CStdioFile *m_pFileList;
	CStdioFile *m_pFileLog;
	CString m_strLine;
	int m_iLineNum;

	CString m_strFullDocDir;
	CString m_strDOMDir;
	CString m_strLBIDir;
	CString m_strXMLDir;
	CString m_strListfile;

	CString m_strName;
	int	m_iBlockID;




protected: // create from serialization only
	CMFCbrowserView();
	DECLARE_DYNCREATE(CMFCbrowserView)

// Attributes
public:
	CMFCbrowserDoc* GetDocument() const;

// Operations
public:

// Overrides
	public:
virtual BOOL PreCreateWindow(CREATESTRUCT& cs);
protected:
	virtual void OnInitialUpdate(); // called first time after construct

// Implementation
public:
	virtual ~CMFCbrowserView();
#ifdef _DEBUG
	virtual void AssertValid() const;
	virtual void Dump(CDumpContext& dc) const;
#endif

protected:

// Generated message map functions
protected:
	DECLARE_MESSAGE_MAP()
public:
	virtual BOOL OnAmbientProperty(COleControlSite* pSite, DISPID dispid, VARIANT* pvar);
	virtual void DocumentComplete(LPDISPATCH pDisp, VARIANT* URL);
	virtual void OnNavigateError(LPCTSTR lpszURL, LPCTSTR lpszFrame, DWORD dwError, BOOL *pbCancel);
	
	afx_msg void OnVipsNavigateurl();
	afx_msg void OnVipsProcesslist();
	void NextListItem();
	void NextListItem_Stream();
	void AnalyzeListItem();

};

#ifndef _DEBUG  // debug version in MFCbrowserView.cpp
inline CMFCbrowserDoc* CMFCbrowserView::GetDocument() const
   { return reinterpret_cast<CMFCbrowserDoc*>(m_pDocument); }
#endif

