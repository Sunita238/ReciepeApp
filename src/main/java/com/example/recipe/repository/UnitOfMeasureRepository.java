package com.example.recipe.repository;

import java.util.Optional;

import com.example.recipe.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    public Optional<UnitOfMeasure> findByMeasure(String desc);
}
