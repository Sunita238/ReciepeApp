package com.example.recipe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String measure;

    @OneToOne(mappedBy = "unitOfMeasure")
    private Ingredient ingredient;

}
