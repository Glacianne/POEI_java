public class SurfaceAir {
    // Anne-Isabelle

    public static String surfaceRectangle(int largeur, int longueur) {
        double surfaceRectangle = largeur * longueur;
        return "La surface du rectangle est de " + surfaceRectangle + " m2";
    }

    public static String surfaceCarre(int cote) {
        double surfaceCarre = cote * cote;
        return "La surface du carré est de " + surfaceCarre + " m2";
    }

    public static String surfaceCercle(double rayon) {
        double surfaceCercle = Math.PI * rayon * rayon;
        return "La surface du cercle est de " + surfaceCercle + " m2";
    }

    public static void main(String[] args) {
        System.out.println(surfaceRectangle(5, 8));
        System.out.println(surfaceCarre(7));
        System.out.println(surfaceCercle(7.5));
    }
}
