package com.example.springboot.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.DAO.CategoryDAO;
import com.example.springboot.model.Category;
import com.example.springboot.repository.CategoryRepository;

@Service
public class CategoryDAOImpl implements CategoryDAO{

	private CategoryRepository cateRepository;
	

	public CategoryDAOImpl(CategoryRepository cateRepository) {
		super();
		this.cateRepository = cateRepository;
	}


	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return cateRepository.findAll();
	}

}
