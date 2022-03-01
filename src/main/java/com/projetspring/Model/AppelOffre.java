package com.projetspring.Model;

import com.projetspring.Interface.Personne;
import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
public class AppelOffre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String objet;
    private double montant;
    private Date datepublication;
    private Date datefin;
    private long delai;

    public long getDelai() {
        return delai=datefin.getTime()-datepublication.getTime();
    }

    public void setDelai(long delai) {
        this.delai = delai;
    }

    @OneToOne(targetEntity = PersonnePhisique.class)

    @JoinColumn(name = "PersonneP_id",referencedColumnName = "id")
    private PersonnePhisique PH;
    @OneToOne(targetEntity = PersonneMorale.class)

    @JoinColumn(name = "PersonneM_id",referencedColumnName = "id")
    private PersonneMorale PM;
}
