package com.devs.wakagames.controller;

import java.util.List;
import java.util.Optional;

import com.devs.wakagames.model.Product;
import com.devs.wakagames.repository.ProductRepository;

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
@RequestMapping("/product")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {

	@Autowired
	private ProductRepository repository;

	@GetMapping
	public ResponseEntity<List<Product>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getById(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(repository.findById(id).get());
	}

	@GetMapping("/{name}")
	public ResponseEntity<List<Product>> getByName(@PathVariable String name) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.findByNameContainingIgnoreCase(name));
	}

	@PostMapping("/newproduct")
	public ResponseEntity<Product> insertProduct(@RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(product));
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
		Optional<Product> productExist = repository.findById(id);
		if (productExist.isPresent()) {
			repository.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body("Product deleted!");
		} else {
            return ResponseEntity.status(HttpStatus.OK).body("Product not found!");
		}
	}

}