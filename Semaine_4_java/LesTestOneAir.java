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

    static public boolean bisextile(int annee) {
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

}

public class LesTestOneAir {
    public static void main(String[] args) {
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

        if (Atester.bisextile(2020))
            System.out.println("OK");
        else
            System.out.println("KO");

        if (Atester.bisextile(2021))
            System.out.println("KO");
        else
            System.out.println("OK");
    }
}