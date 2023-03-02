package com.choongang.ScheduleProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tables")
public class TableController {
	
	@GetMapping("/data")
	public String data() {
		return "/tables/tables-data";
	}
	@GetMapping("/general")
	public String general() {
		return "/tables/tables-general";
	}
}
