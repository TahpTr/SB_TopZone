package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springboot.DAO.CategoryDAO;

@Controller
public class CategoryController {

	
	private CategoryDAO cdao; 
	
	public CategoryController(CategoryDAO cdao) {
		super();
		this.cdao = cdao;
	}

}
