package com.example.recipe.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/*@Data
@EqualsAndHashCode(exclude = {"reciepe"})*/
@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "unit_of_measure")
    private UnitOfMeasure uom;

    @ManyToOne
    @JoinColumn(name = "receipe_id")
    private Reciepe reciepe;

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Reciepe reciepe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.reciepe = reciepe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public UnitOfMeasure getUom() {
        return uom;
    }

    public void setUom(UnitOfMeasure uom) {
        this.uom = uom;
    }

    public Reciepe getReciepe() {
        return reciepe;
    }

    public void setReciepe(Reciepe reciepe) {
        this.reciepe = reciepe;
    }
}
