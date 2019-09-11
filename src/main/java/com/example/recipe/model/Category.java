package com.example.recipe.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

/*@Data
@EqualsAndHashCode(exclude = {"recipes"})*/
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "categories")
    private Set<Reciepe> reciepes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<Reciepe> getReciepes() {
        return reciepes;
    }

    public void setReciepes(Set<Reciepe> reciepes) {
        this.reciepes = reciepes;
    }
}
