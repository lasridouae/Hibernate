package com.gestion.etudiant.core.models;
import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Table(name="Role")
public class Role  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_role")
    private int idRole ;
    @Column(name="nom")
    private String nom;
    @Transient //exclure une proprieté
    @OneToOne(mappedBy = "role")
    private Users user;

    public Role() {
    }

    public Role(int idRole , String nom) {
        this.idRole = idRole ;
        this.nom = nom;
    }

    public int getId() {
        return idRole ;
    }

    public void setId(int id) {
        this.idRole  = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
