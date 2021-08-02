package com.devs.wakagames.repository;

import java.util.List;

import com.devs.wakagames.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

     //public List<Category> findAllByNameContainingIgonreCase (String name);

}