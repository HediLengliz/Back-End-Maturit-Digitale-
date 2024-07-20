package models;

import jakarta.persistence.*;
import models.Adresse;

@Entity
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    public Societe(Long id, Adresse adresse) {
        this.id = id;
        this.adresse = adresse;
    }

    public Societe() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
