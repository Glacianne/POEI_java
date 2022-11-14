package Leboncoin;

import java.util.Scanner;
import Leboncoin.AnnonceAir;

public class VehiculeAir extends AnnonceAir {

    private String brand;
    private String model;
    private String color;
    private String km;
    private String year;

    public VehiculeAir() {
    }

    @Override
    public String toString() {
        return super.toString() + "\nMarque : " + brand + "\nModèle : " + model + "\nCouleur : " + color
                + "\nKilomètrage : " + km + "\nAnnée : " + year;
    }

    public void saisie(Scanner sc) {
        super.saisie(sc);

        System.out.print("Marque : ");
        this.brand = sc.nextLine();
        System.out.print("Modèle : ");
        this.model = sc.nextLine();
        System.out.print("Couleur : ");
        this.color = sc.nextLine();
        System.out.print("Kilomètrage : ");
        this.km = sc.nextLine();
        System.out.print("Année de construction : ");
        this.year = sc.nextLine();

    }

}
