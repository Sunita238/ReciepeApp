package com.example.recipe.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.recipe.model.Reciepe;
import com.example.recipe.repository.ReciepeRepository;

@Service
public class ReciepeServiceImpl implements ReciepeService {
    private ReciepeRepository reciepeRepository;

    public ReciepeServiceImpl(ReciepeRepository reciepeRepository) {
        this.reciepeRepository = reciepeRepository;
    }

    @Override
    public Set<Reciepe> getReciepes() {
        Set<Reciepe> reciepeSet = new HashSet<>();
        reciepeRepository.findAll().forEach(reciepeSet::add);
        return reciepeSet;
    }
}
