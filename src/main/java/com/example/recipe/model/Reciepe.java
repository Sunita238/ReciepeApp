package com.example.recipe.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Reciepe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String directions;
    private String description;
    private Integer prepTime;
    private Integer cookTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="notes_id")
    private Notes notes;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reciepe")
    private Set<Ingredient> ingredients;

    @ManyToMany
    @JoinTable(name = "Reciepe_category",
            joinColumns = @JoinColumn(name = "receipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;

}
