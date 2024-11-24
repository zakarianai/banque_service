package org.banqueservice.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Compte {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Enumerated(EnumType.STRING)
    private TypeCompte type;
}
