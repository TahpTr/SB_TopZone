package com.example.springboot.controller;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AccountController {

	@GetMapping("/login")
	public String showlogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(HttpServletRequest req ,Model model) {
		
		String userName = req.getParameter("username");
		String pwd = req.getParameter("password");
		
		if(userName == "phat1452vn" && pwd == "123") {
			return "success";
		}else
		{
			model.addAttribute("message","Sai thông tin đăng nhập ");
		}
		return "redirect:/index";
	}
}
