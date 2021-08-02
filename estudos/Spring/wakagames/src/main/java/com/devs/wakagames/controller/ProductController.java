package com.devs.wakagames.controller;


import java.util.List;

import com.devs.wakagames.model.Product;
import com.devs.wakagames.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin()
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
	     return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}
	
	
	
	
	
}