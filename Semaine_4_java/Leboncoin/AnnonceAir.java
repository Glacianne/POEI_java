package Leboncoin;

import java.util.Scanner;

public class AnnonceAir {

    private String title;
    private String author;
    private String price;

    public AnnonceAir() {
    }

    public String toString() {
        return "***********************************************\nAnnonce publiée :\n" + "Titre : " + title
                + "\nAuteur : " + author + "\nPrix : " + price;
    }

    public void saisie(Scanner sc) {

        System.out.println("Saisie de l'annonce");
        System.out.print("Auteur de l'annonce : ");
        this.author = sc.nextLine();
        System.out.print("Titre de l'annonce : ");
        this.title = sc.nextLine();
        System.out.print("Prix en euros : ");
        this.price = sc.nextLine();
        System.out.println("");

    }
}