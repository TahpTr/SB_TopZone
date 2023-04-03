package com.example.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCate;
	@Column(name="name")
	private String name;
	@Column(name="img")
	private String img;
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getIdCate() {
		return idCate;
	}
	public void setIdCate(int idCate) {
		this.idCate = idCate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int idCate, String name, String img) {
		super();
		this.idCate = idCate;
		this.name = name;
		this.img = img;
	}
	
}
