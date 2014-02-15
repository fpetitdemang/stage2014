// MFCbrowserDoc.cpp : implementation of the CMFCbrowserDoc class
//

#include "stdafx.h"
#include "MFCbrowser.h"

#include "MFCbrowserDoc.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#endif


// CMFCbrowserDoc

IMPLEMENT_DYNCREATE(CMFCbrowserDoc, CDocument)

BEGIN_MESSAGE_MAP(CMFCbrowserDoc, CDocument)
END_MESSAGE_MAP()


// CMFCbrowserDoc construction/destruction

CMFCbrowserDoc::CMFCbrowserDoc()
{
	// TODO: add one-time construction code here

}

CMFCbrowserDoc::~CMFCbrowserDoc()
{
}

BOOL CMFCbrowserDoc::OnNewDocument()
{
	if (!CDocument::OnNewDocument())
		return FALSE;

	// TODO: add reinitialization code here
	// (SDI documents will reuse this document)

	return TRUE;
}




// CMFCbrowserDoc serialization

void CMFCbrowserDoc::Serialize(CArchive& ar)
{
	if (ar.IsStoring())
	{
		// TODO: add storing code here
	}
	else
	{
		// TODO: add loading code here
	}
}


// CMFCbrowserDoc diagnostics

#ifdef _DEBUG
void CMFCbrowserDoc::AssertValid() const
{
	CDocument::AssertValid();
}

void CMFCbrowserDoc::Dump(CDumpContext& dc) const
{
	CDocument::Dump(dc);
}
#endif //_DEBUG


// CMFCbrowserDoc commands
