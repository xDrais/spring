package tn.esprit.spring.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Integer idContrat; // Clé primaire

    private Date dateDebutContrat ;
    private Date dateFinContrat ;

    public Specialite getSpecialite()
    {
        return specialite;
    }
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private Boolean archive;
    private Integer montantContrat;


    @ManyToOne(fetch = FetchType.LAZY)
    private Etudiant etudiant;

}
