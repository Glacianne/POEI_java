class LineAir {

    public static void lineSpeciale(int longueur, String extremit, String remplissage) {
        System.out.print(extremit);
        for (int j = 0; j < longueur - 2; j = j + 1)
            System.out.print(remplissage);
        System.out.println(extremit);
    }

    public static void lineOfX(int longueur) {
        lineSpeciale(longueur, "+", "-");
    }

    public static void rectangle(int largeur, int hauteur) {
        lineOfX(largeur);
        for (int i = 0; i < hauteur; i = i + 1)
            lineSpeciale(largeur, "|", " ");
        lineOfX(largeur);
    }

    public static void main(String[] args) {

        rectangle(20, 5);
        rectangle(5, 5);
        rectangle(10, 3);
    }

}