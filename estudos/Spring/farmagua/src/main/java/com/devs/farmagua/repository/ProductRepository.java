package com.devs.farmagua.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devs.farmagua.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

     //public List<Product> findAllByNameContainingIgonreCase(String name);

}