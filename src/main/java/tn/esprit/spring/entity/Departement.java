package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Integer idDepart; // Clé primaire

    private String nomDepart;

    @OneToMany(mappedBy = "departement", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
