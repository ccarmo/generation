package com.devs.wakagames.controller;

import java.util.List;
import java.util.Optional;

import com.devs.wakagames.model.Category;
import com.devs.wakagames.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryController {

	@Autowired
	private CategoryRepository repository;

	@GetMapping
	public ResponseEntity<List<Category>> getAllCategory() {
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}

	@GetMapping("/{name}")
	public ResponseEntity<List<Category>> getByName(@PathVariable String name) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAllByNameContainingIgnoreCase(name));
	}

	@PostMapping("/newcategory")
	public ResponseEntity<Category> insertCategory(@RequestBody Category category) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(category));
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
		Optional<Category> categoryExist = repository.findById(id);
		if (categoryExist.isPresent()) {
		   repository.deleteById(id);
           return ResponseEntity.status(HttpStatus.OK).body("Category deleted!");
		} else {
			return ResponseEntity.status(HttpStatus.OK).body("Category not found!");
		}
	}

}