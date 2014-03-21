// URLDlg.cpp : implementation file
//

#include "stdafx.h"
#include "MFCbrowser.h"
#include "URLDlg.h"


// CDlgUrl dialog

IMPLEMENT_DYNAMIC(CDlgUrl, CDialog)
CDlgUrl::CDlgUrl(CWnd* pParent /*=NULL*/)
	: CDialog(CDlgUrl::IDD, pParent)
	, m_strUrl(_T(""))
	, m_bAnalyzeOutputAll(FALSE)
	, m_bAnalyzeOutputAllText(FALSE)
{
}

CDlgUrl::~CDlgUrl()
{
}

void CDlgUrl::DoDataExchange(CDataExchange* pDX)
{
	CDialog::DoDataExchange(pDX);
	DDX_Text(pDX, IDC_EDIT_URL, m_strUrl);
	DDX_Check(pDX, IDC_CHECK1, m_bAnalyzeOutputAll);
	DDX_Check(pDX, IDC_CHECK2, m_bAnalyzeOutputAllText);
}


BEGIN_MESSAGE_MAP(CDlgUrl, CDialog)
END_MESSAGE_MAP()


// CDlgUrl message handlers
