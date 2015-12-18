package com.daosyu.model.profile;

import java.util.List;

import com.daosyu.model.smallgroup.SmallGroup;

//회원 가입 및 회원을 나타내는 vo
public class Profile {
	private int profile_id;
	private String user_picture;
	private String user_id;
	private String user_pwd;
	private String user_name;	
	private String user_region;
	private String user_gender;
	private String user_hobby;
	private String user_intro;	
	private List<SmallGroup> smList;
	
	
	public int getProfile_id() {
		return profile_id;
	}
	
	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}
	
	public String getUser_picture() {
		return user_picture;
	}
	
	public void setUser_picture(String user_picture) {
		this.user_picture = user_picture;
	}
	
	public String getUser_id() {
		return user_id;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getUser_pwd() {
		return user_pwd;
	}
	
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	
	public String getUser_name() {
		return user_name;
	}
	
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	public String getUser_region() {
		return user_region;
	}
	
	public void setUser_region(String user_region) {
		this.user_region = user_region;
	}
	
	public String getUser_gender() {
		return user_gender;
	}
	
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	
	public String getUser_hobby() {
		return user_hobby;
	}
	
	public void setUser_hobby(String user_hobby) {
		this.user_hobby = user_hobby;
	}
	
	public String getUser_intro() {
		return user_intro;
	}
	
	public void setUser_intro(String user_intro) {
		this.user_intro = user_intro;
	}
	
	public List<SmallGroup> getSmList() {
		return smList;
	}
	
	public void setSmList(List<SmallGroup> smList) {
		this.smList = smList;
	}
	
	
	
	
}
