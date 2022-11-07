class TicketCaisseOneAir {
    // Anne-Isabelle

    public static void main(String[] args) {
        String articles[] = { "patate", "tomate", "oignons", "radis", "salade", "rose", "jasmin", "nénuphar", "oeillet",
                "tulipe", "rhododendron" };
        Double prixs[] = { 1.5, 4.0, 1.6, 1.5, 1.0, 7.0, 14.0, 78.55, 5.5, 4.0, 19.99 };
        Double qte[] = { 3.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.5, 0.0, 5.0, 11.0 };

        System.out.println(String.format("%-6s    %-15s %6s %10s", "numéro", "article", "prix", "quantité"));

        for (int i = 0; i < articles.length; i++) {
            System.out.println(String.format("%-6d -> %-15s %6.2f %10.2f", i + 1, articles[i], prixs[i], qte[i]));
        }

        /*
         * numero article prix
         * article n° 1 -> patate 1.50
         * article n° 2 -> tomate 4.00
         * article n° 3 -> oignons 1.60
         * article n° 4 -> radis
         * article n° 5 -> salade
         * article n° 6 -> rose 7.00
         * article n° 7 -> jasmin 14.00
         * article n° 8 -> nénuphar 78.55
         * article n° 9 -> oeillet
         * article n° 10 -> tulipe
         * article n° 11 -> rodhodendron
         */

    }
}
