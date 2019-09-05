package com.example.recipe.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "categories")
    private Set<Reciepe> reciepes;
}
