package com.projetspring.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
public class Reference {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String objet;
    private String entite;
    private Date datereference;
    private float montant;
    @ManyToOne
    //@JoinColumn(name = "idph")
    private PersonnePhisique pp;
    @ManyToOne
    //@JoinColumn(name = "idpm")
    private PersonneMorale pm;


}
