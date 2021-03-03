package com.gestion.etudiant.core.models;



import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Types")
public class Type  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idType;
    private String nom;

    public Type() {
    }

    public Type(long idType, String nom) {
        this.idType = idType;
        this.nom = nom;
    }

    public long getIdType() {
        return idType;
    }

    public void setId(int idType) {
        this.idType = idType;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
