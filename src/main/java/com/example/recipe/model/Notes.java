package com.example.recipe.model;

import javax.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String notes;
    @OneToOne(mappedBy = "notes")
    private Reciepe reciepe;
}
