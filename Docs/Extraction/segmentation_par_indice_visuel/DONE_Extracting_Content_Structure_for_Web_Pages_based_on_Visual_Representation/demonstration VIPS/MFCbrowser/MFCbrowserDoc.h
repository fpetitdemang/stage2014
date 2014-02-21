// MFCbrowserDoc.h : interface of the CMFCbrowserDoc class
//


#pragma once

class CMFCbrowserDoc : public CDocument
{
protected: // create from serialization only
	CMFCbrowserDoc();
	DECLARE_DYNCREATE(CMFCbrowserDoc)

// Attributes
public:

// Operations
public:

// Overrides
	public:
	virtual BOOL OnNewDocument();
	virtual void Serialize(CArchive& ar);

// Implementation
public:
	virtual ~CMFCbrowserDoc();
#ifdef _DEBUG
	virtual void AssertValid() const;
	virtual void Dump(CDumpContext& dc) const;
#endif

protected:

// Generated message map functions
protected:
	DECLARE_MESSAGE_MAP()
};


