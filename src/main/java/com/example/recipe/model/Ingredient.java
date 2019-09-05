package com.example.recipe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ingredient;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_of_measure")
    private UnitOfMeasure unitOfMeasure;

    @ManyToOne
    @JoinColumn(name = "receipe_id")
    private Reciepe reciepe;

}
