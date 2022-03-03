package com.projetspring.Model;

import com.projetspring.Interface.Personne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
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
