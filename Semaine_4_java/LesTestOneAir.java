// Anne-Isabelle

class Atester {

    static public Integer calcul1(int var) {
        return 5 * var;
    }

    static public String presentation(String n) {
        if (n == null || n.length() == 0) {
            return n;
        }

        return n.substring(0, 1).toUpperCase() + n.substring(1).toLowerCase();
    }

    static public boolean isBisextile(int annee) {
        if (annee % 400 == 0) {
            return true;
        } else if (annee % 100 == 0) {
            return false;
        } else if (annee % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static public Double tarif(int age) {
        return age < 12 ? 4.0 : age < 60 ? 5.5 : 4.5;
    }

}

public class LesTestOneAir {
    public static void main(String[] args) {
        System.out.println("Tests calculs");
        if (Atester.calcul1(3) == 15)
            System.out.println("OK");
        else
            System.out.println("KO");

        if (Atester.calcul1(0) == 0)
            System.out.println("OK");
        else
            System.out.println("KO");

        if (Atester.calcul1(1) == 5)
            System.out.println("OK");
        else
            System.out.println("KO");

        System.out.println("Tests strings");
        if (Atester.presentation("toto").equals("Toto"))
            System.out.println("OK");
        else
            System.out.println("KO");

        if (Atester.presentation("TOTO").equals("Toto"))
            System.out.println("OK");
        else
            System.out.println("KO");

        if (Atester.presentation("").equals(""))
            System.out.println("OK");
        else
            System.out.println("KO");

        if (Atester.presentation("1234567890").equals("1234567890"))
            System.out.println("OK");
        else
            System.out.println("KO");

        System.out.println("Tests années bisextiles");
        if (Atester.isBisextile(2020))
            System.out.println("OK");
        else
            System.out.println("KO");

        if (Atester.isBisextile(2021))
            System.out.println("KO");
        else
            System.out.println("OK");

        /*
         * inf à 12 a -> 4€
         * inf à 60 a -> 5.5€
         * sup ega à 60 a -> 4.5€
         */
    }
}