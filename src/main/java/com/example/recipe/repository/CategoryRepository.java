package com.example.recipe.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.recipe.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    public Optional<Category> findByCategory(String desc);
}
