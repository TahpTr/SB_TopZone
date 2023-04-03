package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
