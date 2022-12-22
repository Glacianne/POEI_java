package org.example.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private int id;

    private String nom;

    private String prenom;

    private Date date_naissance;

    @ManyToMany()
    @JoinTable(name = "CLIENT_COMPTE",
    joinColumns = @JoinColumn(name = "CLIENT_ID", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "COMPTE_ID", referencedColumnName = "id"))
    private Collection<Compte> comptes;

    public Client(){}

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date naissance) {
        this.date_naissance = naissance;
    }

    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }
}
