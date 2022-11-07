public class TriangleAir {
    // Anne-Isabelle

    public static void triangle(double n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Le nombre d'étoiles est " + (n * n / 2 + n / 2));
    }

    public static void main(String[] args) {

        triangle(6);

    }
}
