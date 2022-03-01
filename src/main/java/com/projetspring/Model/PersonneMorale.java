package com.projetspring.Model;

import com.projetspring.Interface.Personne;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
public class PersonneMorale implements Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String denomination;
    private String NumIm;

     @OneToMany(mappedBy = "pm")
     private List<Reference> R;

    @OneToOne(targetEntity = PersonnePhisique.class)
    @JoinColumn(referencedColumnName = "id")
   private PersonnePhisique Representantlegale;

    @Override
    public void setReference(Reference r) {

    }

    @Override
    public Reference getReference() {
        return null;
    }


}
