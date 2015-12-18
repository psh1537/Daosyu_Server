package com.daosyu.model.smallgroup;

import java.util.List;

import com.daosyu.model.album.Album;
import com.daosyu.model.jungmo.JungMo;
import com.daosyu.model.notice.Notice;
import com.daosyu.model.profile.Profile;

//소모임 만드는 vo
public class SmallGroup {
	private int small_group_id;
	private String small_regdate;
	private String small_category_picture;
	private String small_name;
	private String small_region;
	private int small_people_number;
	private String small_intro;
	private String small_detail;	
	private String profile_id;
	private List<JungMo> jungmoList;
	private List<Notice> noticeList;
	private List<Album> ablList;
	private List<Profile> proList;
	
	
	public int getSmall_group_id() {
		return small_group_id;
	}
	public void setSmall_group_id(int small_group_id) {
		this.small_group_id = small_group_id;
	}
	public String getSmall_regdate() {
		return small_regdate;
	}
	public void setSmall_regdate(String small_regdate) {
		this.small_regdate = small_regdate;
	}
	public String getSmall_category_picture() {
		return small_category_picture;
	}
	public void setSmall_category_picture(String small_category_picture) {
		this.small_category_picture = small_category_picture;
	}
	public String getSmall_name() {
		return small_name;
	}
	public void setSmall_name(String small_name) {
		this.small_name = small_name;
	}
	public String getSmall_region() {
		return small_region;
	}
	public void setSmall_region(String small_region) {
		this.small_region = small_region;
	}
	public int getSmall_people_number() {
		return small_people_number;
	}
	public void setSmall_people_number(int small_people_number) {
		this.small_people_number = small_people_number;
	}
	public String getSmall_intro() {
		return small_intro;
	}
	public void setSmall_intro(String small_intro) {
		this.small_intro = small_intro;
	}
	public String getSmall_detail() {
		return small_detail;
	}
	public void setSmall_detail(String small_detail) {
		this.small_detail = small_detail;
	}
	public String getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(String profile_id) {
		this.profile_id = profile_id;
	}
	public List<JungMo> getJungmoList() {
		return jungmoList;
	}
	public void setJungmoList(List<JungMo> jungmoList) {
		this.jungmoList = jungmoList;
	}
	public List<Notice> getNoticeList() {
		return noticeList;
	}
	public void setNoticeList(List<Notice> noticeList) {
		this.noticeList = noticeList;
	}
	public List<Album> getAblList() {
		return ablList;
	}
	public void setAblList(List<Album> ablList) {
		this.ablList = ablList;
	}
	public List<Profile> getProList() {
		return proList;
	}
	public void setProList(List<Profile> proList) {
		this.proList = proList;
	}
	
	
	
}
