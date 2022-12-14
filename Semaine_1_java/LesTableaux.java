class LesTableaux {
    // Xavier

    // variable of class
    static String poissons[] = { "sardine", "dauphin", "morue", "bar", "daurade", "requin" };

    public static void showArray(String tab[]) {
        Integer sizeTableau = tab.length;
        System.out.println("la size du tableau est : " + sizeTableau);

        // loop indice
        for (int i = 0; i < sizeTableau; i++) {
            String element = tab[i];
            System.out.println(String.format("n° %d  : %s ", i, element));
            // n° 1 : dauphin
        }

        // loop foreach
        for (String element : tab) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        showArray(poissons);

        // variable local in main
        String oiseauxs[] = { "pivert", "pie", "merle", "colibri", "rouge-gorge", "corbeau", "kiwi", "" };

        oiseauxs[0] = "aigle";
        oiseauxs[7] = "perruche";

        showArray(oiseauxs);
    }
}