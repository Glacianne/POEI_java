class MultiplicationAir {
    // Anne-Isabelle

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                String resultat = String.format("%dx%d =%3d ", i, j, i * j);
                System.out.print(resultat);
            }
            System.out.println("");
        }

    }

}