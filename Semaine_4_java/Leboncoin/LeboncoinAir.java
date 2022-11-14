package Leboncoin;

import java.util.Scanner;

import Leboncoin.ImmobilierAir;
import Leboncoin.VehiculeAir;
import Leboncoin.LivreAir;

class LeBonCoinAir {
    // Anne-Isabelle

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel type d'annonce voulez-vous poster ?");
        System.out.println("Immobilier (i), Véhicule (v), Livre (l)");
        String typeAnnonce = sc.nextLine();

        AnnonceAir a = new AnnonceAir();
        if (typeAnnonce.equals("i"))
            a = new ImmobilierAir();
        else if (typeAnnonce.equals("v"))
            a = new VehiculeAir();
        else if (typeAnnonce.equals("l"))
            a = new LivreAir();

        a.saisie(sc);
        System.out.println(a);

        sc.close();
    }
}