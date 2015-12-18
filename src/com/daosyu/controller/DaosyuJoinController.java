package com.daosyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.daosyu.model.profile.ProfileService;

@Controller
public class DaosyuJoinController {
	@Autowired
	private ProfileService profileService;
	
	@RequestMapping("/daosyu/insert.do")
	public ModelAndView join(){
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
}
