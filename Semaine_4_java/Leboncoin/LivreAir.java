package Leboncoin;

import java.util.Scanner;
import Leboncoin.AnnonceAir;

public class LivreAir extends AnnonceAir {
    private String writter;
    private String type;

    public LivreAir() {
    }

    @Override
    public String toString() {
        return super.toString() + "\nEcrivain : " + writter + "\nStyle : " + type;
    }

    public void saisie(Scanner sc) {
        super.saisie(sc);

        System.out.print("Ecrivain : ");
        this.writter = sc.nextLine();
        System.out.print("Style : ");
        this.type = sc.nextLine();
    }
}
