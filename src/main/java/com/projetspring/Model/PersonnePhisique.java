package com.projetspring.Model;

import com.projetspring.Interface.Personne;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data

@Entity
public class PersonnePhisique implements Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String mail;
    @OneToMany(mappedBy = "pp")
    private List<Reference> R;

    @Override
    public void setReference(Reference r) {

    }

    @Override
    public Reference getReference() {
        return null;
    }

}
