package com.example.recipe.repository;

import com.example.recipe.model.Reciepe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReciepeRepository extends CrudRepository<Reciepe, Long> {
}
