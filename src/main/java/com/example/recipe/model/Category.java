package com.example.recipe.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "categories")
    private Set<Reciepe> reciepes;
}
