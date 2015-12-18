package com.daosyu.model.personalnews;

public class PersonalNews {
	private int news_id;
	private String user_name;
	private String news_regdate;
	private String news_title;
	private String news_content;
	private int profile_id;
	
	
	public int getNews_id() {
		return news_id;
	}
	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getNews_regdate() {
		return news_regdate;
	}
	public void setNews_regdate(String news_regdate) {
		this.news_regdate = news_regdate;
	}
	public String getNews_title() {
		return news_title;
	}
	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}
	public String getNews_content() {
		return news_content;
	}
	public void setNews_content(String news_content) {
		this.news_content = news_content;
	}
	public int getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}
	
	
}
