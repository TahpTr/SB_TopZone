package com.example.springboot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springboot.DAO.ProductDAO;

@Controller
public class ProductController {
     
	private ProductDAO pdao;
	
    public ProductController(ProductDAO pdao) {
		super();
		this.pdao = pdao;
	}	
}
