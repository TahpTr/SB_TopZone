package com.example.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot.DAO.CategoryDAO;
import com.example.springboot.DAO.ProductDAO;
import com.example.springboot.DAO.UserDAO;
import com.example.springboot.model.*;

@Controller
public class HomeController {
	
	private ProductDAO pdao;
	
	private CategoryDAO cdao;
	
	public HomeController(ProductDAO pdao, CategoryDAO cdao) {
		super();
		this.pdao = pdao;
		this.cdao = cdao;
	}

	@GetMapping("/")
	public String welcome(Model model) {
		model.addAttribute("categories",cdao.getAllCategory());
		model.addAttribute("products",pdao.getAllProduct());
        return "user/index";
	}
}