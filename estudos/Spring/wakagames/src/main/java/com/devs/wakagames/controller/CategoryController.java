package com.devs.wakagames.controller;

import java.util.List;

import com.devs.wakagames.model.Category;
import com.devs.wakagames.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin()
public class CategoryController {

	@Autowired
	private CategoryRepository repository;

	@GetMapping
	public ResponseEntity<List<Category>> findAllCategory() {
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}
    
	
	@GetMapping("/{name}")
	public ResponseEntity<List<Category>> findByName(@PathVariable String name) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAllByNameContainingIgnoreCase(name));
	}
	

}