package com.example.exercice4;

import java.util.ArrayList;

public class Livre {
    private String titre;
    private String auteur;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    static ArrayList<Livre> listeLivres = new ArrayList<>();

    public static void addLivre(Livre livre){
        listeLivres.add(livre);
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }

    public static ArrayList<Livre> getListeLivres() {
        return listeLivres;
    }

    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
}
