class HelloWorldAir {
    // Anne-Isabelle

    public static void lineBuild(char ch, int number) {
        for (int i = 0; i < number; i++)
            System.out.print(ch);
    }

    public static void rectangle(int largeur, int hauteur) {

        lineBuild('X', largeur);

        for (int i = 0; i < hauteur; i++) {
            System.out.println("");
            System.out.print("X");
            lineBuild(' ', largeur - 2);
            System.out.print("X");
        }
        System.out.println("");
        lineBuild('X', largeur);

    }

    public static void main(String[] args) {

        rectangle(12, 5);

    }

}