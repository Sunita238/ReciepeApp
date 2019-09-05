package com.example.recipe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String notes;
    @OneToOne(mappedBy = "notes")
    private Reciepe reciepe;

}
