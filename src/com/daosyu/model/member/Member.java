package com.daosyu.model.member;

import java.util.List;

import com.daosyu.model.profile.Profile;
import com.daosyu.model.smallgroup.SmallGroup;

public class Member {
	private int member_id;
	private List<Profile> profileList;
	private List<SmallGroup> smgList;
	
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public List<Profile> getProfileList() {
		return profileList;
	}
	public void setProfileList(List<Profile> profileList) {
		this.profileList = profileList;
	}
	public List<SmallGroup> getSmgList() {
		return smgList;
	}
	public void setSmgList(List<SmallGroup> smgList) {
		this.smgList = smgList;
	}
	
	
}
