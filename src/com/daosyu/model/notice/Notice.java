package com.daosyu.model.notice;

//공지사항 관련 CRUD
public class Notice {
	private int notice_id;
	private String notice_title;
	private String notice_detail;
	private int small_group_id;
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_detail() {
		return notice_detail;
	}
	public void setNotice_detail(String notice_detail) {
		this.notice_detail = notice_detail;
	}
	public int getSmall_group_id() {
		return small_group_id;
	}
	public void setSmall_group_id(int small_group_id) {
		this.small_group_id = small_group_id;
	}	
	
	
	
}
