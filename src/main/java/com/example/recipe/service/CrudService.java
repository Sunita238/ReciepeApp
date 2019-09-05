package com.example.recipe.service;

public interface CrudService<T, ID> {
    T save(T t);
    
}
