package com.example.recipe.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/*@Data
@EqualsAndHashCode(exclude = {"reciepe"})*/
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String reciepeNotes;

    @OneToOne(mappedBy = "notes")
    private Reciepe reciepe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReciepeNotes() {
        return reciepeNotes;
    }

    public void setReciepeNotes(String reciepeNotes) {
        this.reciepeNotes = reciepeNotes;
    }

    public Reciepe getReciepe() {
        return reciepe;
    }

    public void setReciepe(Reciepe reciepe) {
        this.reciepe = reciepe;
    }
}
