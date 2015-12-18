package com.daosyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/tes.do")
	public String insert(){
		System.out.println("컨트롤러다");
		return "";
	}
}
