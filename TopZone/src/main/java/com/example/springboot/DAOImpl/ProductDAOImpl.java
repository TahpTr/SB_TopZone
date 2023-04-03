package com.example.springboot.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.DAO.ProductDAO;
import com.example.springboot.model.Product;
import com.example.springboot.repository.ProductRepository;

@Service
public class ProductDAOImpl implements ProductDAO{

	private ProductRepository productRepository;
	


	public ProductDAOImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}



	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

}
