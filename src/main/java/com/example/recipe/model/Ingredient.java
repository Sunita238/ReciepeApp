package com.example.recipe.model;

import javax.persistence.*;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Reciepe getReciepe() {
        return reciepe;
    }

    public void setReciepe(Reciepe reciepe) {
        this.reciepe = reciepe;
    }
}
