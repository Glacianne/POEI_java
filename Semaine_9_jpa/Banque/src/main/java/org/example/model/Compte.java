package org.example.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Compte {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String libelle;

    @Column(nullable = false, length = 27)
    //@NotNull
    //@Length(min = 1, max = 27)
    private String iban;

    @Column(precision = 10, scale = 2)
    private double solde;

    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;

    @ManyToMany(mappedBy = "comptes")
    private Collection<Client> clients;

    public Compte(){}

    public Compte(String libelle, String iban, double solde, Agence agence, Collection<Client> clients) {
        this.libelle = libelle;
        this.iban = iban;
        this.solde = solde;
        this.agence = agence;
        this.clients = clients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Collection<Client> getClients() {
        return clients;
    }

    public void setClients(Collection<Client> clients) {
        this.clients = clients;
    }
}
