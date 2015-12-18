package com.daosyu.model.jungmo;

import java.util.List;

import com.daosyu.model.smallgroup.SmallGroup;

//정모 작성하는 vo
public class JungMo {
	private int jungmo_id;
	private String jungmo_regdate;   //데이터 베이스에 등록된 날짜
	private String jungmo_calendar;  //사용자가 등록하는 날짜
	private String jungmo_region;	  //사용자가 등록한 지역
	private int jungmo_price;	          //사용자가 등록한 가격
	private String title;                     //사용자가 등록한 제목
	private String detail;					  //사용자가 등록한 상세설명
	private int small_group_id;
	
}
