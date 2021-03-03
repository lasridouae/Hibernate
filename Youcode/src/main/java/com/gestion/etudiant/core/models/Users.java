package com.gestion.etudiant.core.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String nom;
    private String prenom;
    @NotEmpty//On indique que ca ne doit pas être vide
    @Email(message="Email is invalid")//Indique que l'on souhaite une adresse mail
    private String email;
    private String password;
    @Transient //exclure une proprieté
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private Role role;


    public Users() {
    }

    public Users(long id, String nom, String prenom, @NotEmpty @Email(message = "Email is invalid") String email, String password, Role role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
