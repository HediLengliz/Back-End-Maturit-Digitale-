package models;

import jakarta.persistence.*;
import models.Societe;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "societe_id")
    private Societe societe;


}
