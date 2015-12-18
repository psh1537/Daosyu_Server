package com.daosyu.model.album;

public class Album {
	private int album_id;
	private String album_title;
	private String album_regdate;
	private String ext;
	private int profile_id;
	public int getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}
	public String getAlbum_title() {
		return album_title;
	}
	public void setAlbum_title(String album_title) {
		this.album_title = album_title;
	}
	public String getAlbum_regdate() {
		return album_regdate;
	}
	public void setAlbum_regdate(String album_regdate) {
		this.album_regdate = album_regdate;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public int getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}
	
	
}
