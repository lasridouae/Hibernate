package com.gestion.etudiant.core.models;

import javax.persistence.*;
import java.io.Serializable;

//@Entity
public class Specialites  implements Serializable {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idSpeciality;
    private String type_specialites;

    public Specialites() {
    }

    public Specialites(int idSpeciality, String type_specialites) {
        this.idSpeciality = idSpeciality;
        this.type_specialites = type_specialites;
    }

    public int getIdSpeciality() {
        return idSpeciality;
    }

    public void setId(int idSpeciality) {
        this.idSpeciality = idSpeciality;
    }

    public String getType_specialites() {
        return type_specialites;
    }

    public void setType_specialites(String type_specialites) {
        this.type_specialites = type_specialites;
    }
}
