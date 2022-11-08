package Semaine_3_java;

import java.util.*;
import java.util.ArrayList.*;

class Point {
    protected Integer x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println(String.format("Point : (%d, %d)", this.x, this.y));
    }
}

class Cercle extends Point {
    int rayon;

    public Cercle(int x, int y, int r) {
        super(x, y);
        this.rayon = r;
    }

    public void affiche() {
        System.out.println(String.format("Cercle : coordonnées(%d, %d) rayon(%d)", this.x, this.y, this.rayon));
    }
}

class Rectangle extends Point {
    int longueur;
    int largeur;
    int surface;

    public Rectangle(int x, int y, int longueur, int largeur) {
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
        this.surface = longueur * largeur;
    }

    public void affiche() {
        System.out.println(
                String.format("Rectangle : coordonnées(%d, %d), longueur(%d), largeur(%d), surface(%d)", this.x, this.y,
                        this.longueur, this.largeur, this.surface));
    }
}

class Carre extends Rectangle {
    int surface;

    public Carre(int x, int y, int c) {
        super(x, y, c, c);
        this.surface = longueur * 2;
    }

    public void affiche() {
        System.out.println(String.format("Carré : coordonnées(%d, %d), côté(%d), surface(%d)", this.x, this.y,
                this.longueur, this.surface));
    }
}

class POOFigureOneAir {
    // Anne-Isabelle

    public static void main(String[] args) {

        Point p1 = new Point(5, 6);
        p1.affiche();

        Cercle c1 = new Cercle(11, 61, 45);
        c1.affiche();

        Carre k1 = new Carre(18, -3, 15);
        k1.affiche();
        Rectangle r1 = new Rectangle(3, 19, 99, 18);
        r1.affiche();
    }
}