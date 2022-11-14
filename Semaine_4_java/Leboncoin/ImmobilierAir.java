package Leboncoin;

import java.util.Scanner;
import Leboncoin.AnnonceAir;

public class ImmobilierAir extends AnnonceAir {

    private String size;
    private String rent;
    private String city;

    public ImmobilierAir() {
    }

    @Override
    public String toString() {
        return super.toString() + "\nSuperficie : " + size + "\nLoyer : " + rent + "\nVille : " + city;
    }

    public void saisie(Scanner sc) {
        super.saisie(sc);

        System.out.print("Superficie : ");
        this.size = sc.nextLine();
        System.out.print("Loyer : ");
        this.rent = sc.nextLine();
        System.out.print("Ville : ");
        this.city = sc.nextLine();

    }
}
