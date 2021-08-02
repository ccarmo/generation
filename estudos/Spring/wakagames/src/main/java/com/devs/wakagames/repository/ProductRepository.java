package com.devs.wakagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devs.wakagames.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

     public List<Product> findAllByNameContainingIgonreCase(String name);

}