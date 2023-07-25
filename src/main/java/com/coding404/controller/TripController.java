package com.coding404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trip")
public class TripController {

	@RequestMapping("/notice_list")
	public String list() {
		return "trip/notice_list";
	}
	
	@RequestMapping("/notice_view")
	public String view() {
		return "trip/notice_view";
	}
	
	@RequestMapping("/notice_modify")
	public String modify() {
		return "trip/notice_modify";
	}
	
	@RequestMapping("/notice_write")
	public String write() {
		return "trip/notice_write";
	}
}
