class ChaineFormatAir {
    // Anne-Isabelle

    public static String tableau(String objet, int qte, double pu) {
        double pt = pu * qte;
        return String.format("| %-10s | %2d | %.2f | %.2f |", objet, qte, pu, pt);
    }

    public static void main(String[] args) {

        System.out.println(tableau("patate", 2, 1.56));
        System.out.println(tableau("parapluie", 2, 1.56));
    }
}

// | libel | qté | PU | PT
// | tomate | 2 | 3.99 | 7.98

// | tomate | 2 | 3.99 | 7.98
// | tomate | 2.-| 3.99 | 7.98
