package com.gestion.etudiant.core.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Formateur extends Users {

    public Formateur(int id, String nom, String prenom, @NotEmpty @Email(message = "Email is invalid") String email, String password, Role role) {
        super(id, nom, prenom, email, password, role);
    }

    public Formateur() {

    }
}
