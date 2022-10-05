package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    private Integer idDetailEquipe; // Clé primaire

    private Integer salle;
    private  String thematique;
    @OneToOne(mappedBy = "detailequipe", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Equipe equipe;
}
