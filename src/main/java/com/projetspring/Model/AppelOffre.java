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
    private Float montant;
    private Date datepublication;
    private Date datefin;
    private long delai;
    @OneToOne(targetEntity = PersonnePhisique.class)
    @MapsId
    @JoinColumn(name = "PersonneP_id",referencedColumnName = "id")
    private PersonnePhisique PH;
    @OneToOne(targetEntity = PersonneMorale.class)
    @MapsId
    @JoinColumn(name = "PersonneM_id",referencedColumnName = "id")
    private PersonneMorale PM;
}
