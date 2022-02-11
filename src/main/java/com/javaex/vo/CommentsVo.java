package com.javaex.vo;

public class CommentsVo {

	// 필드
	public int cmtNo;
	public int postNo;
	public int userNo;
	public String cmtContent;
	public String regDate;

	// 생성자
	public CommentsVo() {
	}

	public CommentsVo(int cmtNo, int postNo, int userNo, String cmtContent, String regDate) {
		super();
		this.cmtNo = cmtNo;
		this.postNo = postNo;
		this.userNo = userNo;
		this.cmtContent = cmtContent;
		this.regDate = regDate;
	}

	// 메소드 gs
	public int getCmtNo() {
		return cmtNo;
	}

	public void setCmtNo(int cmtNo) {
		this.cmtNo = cmtNo;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getCmtContent() {
		return cmtContent;
	}

	public void setCmtContent(String cmtContent) {
		this.cmtContent = cmtContent;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "CommentsVo [cmtNo=" + cmtNo + ", postNo=" + postNo + ", userNo=" + userNo + ", cmtContent=" + cmtContent
				+ ", regDate=" + regDate + "]";
	};

}
