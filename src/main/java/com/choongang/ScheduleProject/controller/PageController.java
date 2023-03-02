package com.choongang.ScheduleProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class PageController {

	@GetMapping("/blank")
	public String blank() {
		return "/pages/pages-blank";
	}
	@GetMapping("/contact")
	public String contact() {
		return "/pages/pages-contact";
	}
	@GetMapping("/error404")
	public String error404() {
		return "/pages/pages-error-404";
	}
	@GetMapping("/faq")
	public String faq() {
		return "/pages/pages-faq";
	}
	@GetMapping("/login")
	public String login() {
		return "/pages/pages-login";
	}
	@GetMapping("/register")
	public String register() {
		return "/pages/pages-register";
	}
}