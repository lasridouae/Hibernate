package com.gestion.etudiant.core.models;
import javax.persistence.*;
import java.io.Serializable;

//@Entity
public class Activites implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idActivity ;
    private String nom;
    private String description;
    private int type_activites;


    public Activites() {
    }

    public Activites(int idActivity, String nom, String description, int type_activites) {
        this.idActivity = idActivity;
        this.nom = nom;
        this.description = description;
        this.type_activites = type_activites;
    }

    public int getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(int idActivity) {
        this.idActivity = idActivity;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getType_activites() {
        return type_activites;
    }

    public void setType_activites(int type_activites) {
        this.type_activites = type_activites;
    }
}
