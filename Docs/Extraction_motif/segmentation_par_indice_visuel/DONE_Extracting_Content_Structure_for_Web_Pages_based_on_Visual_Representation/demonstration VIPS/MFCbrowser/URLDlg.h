#pragma once


// CDlgUrl dialog

class CDlgUrl : public CDialog
{
	DECLARE_DYNAMIC(CDlgUrl)

public:
	CDlgUrl(CWnd* pParent = NULL);   // standard constructor
	virtual ~CDlgUrl();

// Dialog Data
	enum { IDD = IDD_DIALOG_URL };

protected:
	virtual void DoDataExchange(CDataExchange* pDX);    // DDX/DDV support

	DECLARE_MESSAGE_MAP()
public:
	CString m_strUrl;
	BOOL m_bAnalyzeOutputAll;
	BOOL m_bAnalyzeOutputAllText;
};
