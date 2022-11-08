import java.util.*;
import java.util.ArrayList.*;

abstract interface Figure {
    abstract public void move(int x, int y);

    abstract public Integer surface();
}

class Point {
    protected Integer x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche() {
        System.out.println(String.format("Point : (%d, %d)", this.x, this.y));
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}

class Cercle implements Figure {
    Point centre;
    int rayon;

    public Cercle(int x, int y, int r) {
        this.centre = new Point(x, y);
        this.rayon = r;
    }

    public void affiche() {
        System.out.println(String.format("Cercle : (%d, %d) rayon=%d", this.centre.x, this.centre.y, this.rayon));
    }

    public Integer surface() {
        Integer i = (int) (this.rayon * this.rayon * 3.14159);
        return i;
    }

    public void move(int dx, int dy) {
        this.centre.move(dx, dy);
    }
}

class Rectangle implements Figure {
    Point pointHautGauche, pointBasDroite;

    public Rectangle(int x, int y, int l, int L) {
        this.pointHautGauche = new Point(x, y);
        this.pointBasDroite = new Point(x + l, y + L);
    }

    public void affiche() {
        System.out
                .println(String.format("Rect : (%d, %d) Lar=%d, Long%d", this.pointHautGauche.x, this.pointHautGauche.y,
                        this.pointHautGauche.x - this.pointBasDroite.x,
                        this.pointHautGauche.y - this.pointBasDroite.y));
    }

    public Integer surface() {
        return (this.pointHautGauche.x - this.pointBasDroite.x) * (this.pointHautGauche.y - this.pointBasDroite.y);
    }

    public void move(int dx, int dy) {
        this.pointHautGauche.move(dx, dy);
        this.pointBasDroite.move(dx, dy);
    }

}

class Carre extends Rectangle {

    public Carre(int x, int y, int c) {
        super(x, y, c, c);
    }

    public void affiche() {
        System.out.println(String.format("Carre : (%d, %d) cote=%d", this.pointHautGauche.x, this.pointHautGauche.y,
                this.pointHautGauche.x - this.pointBasDroite.x,
                this.pointHautGauche.y - this.pointBasDroite.y));
    }

    public Integer surface() {
        return (this.pointHautGauche.x - this.pointBasDroite.x) * (this.pointHautGauche.y - this.pointBasDroite.y);
    }

    public void move(int dx, int dy) {
        this.pointHautGauche.move(dx, dy);
        this.pointBasDroite.move(dx, dy);
    }

}

class POOFigureTwo {
    // Xavier

    public static void main(String[] args) {

        Point p1 = new Point(5, 6);
        p1.affiche();
        // (5, 6)

        Cercle c1 = new Cercle(11, 61, 45);
        // c1.move( 20, -41);
        c1.affiche();
        System.out.println(String.format("surface Cer %d", c1.surface()));
        // (5, 6)

        Carre k1 = new Carre(18, -3, 15);
        k1.affiche();
        // Carre : (5, 6) cote=15
        System.out.println(String.format("surface K %d", k1.surface()));

        Rectangle r1 = new Rectangle(3, 19, 99, 18);
        r1.affiche();
        // Rectangle : (5, 6) long=99 lar=18
        // Carre : (5, 6) cote=15

        // r1.move( 10, -5 );
        r1.affiche();
        // Rectangle : (16, 1) long=99 lar=18
        System.out.println(String.format("surface %d", r1.surface()));

    }
}