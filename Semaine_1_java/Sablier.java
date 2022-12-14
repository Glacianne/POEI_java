public class Sablier {

    public static void sablier(int n) {
        for (int j = 0; j == n; j++) {
            System.out.println("*");
        }

        for (int k = 0; k == n; k++) {
            System.out.print("");
        }
        n -= 2;
    }

    public static void main(String[] args) {

        sablier(9);

    }

}
