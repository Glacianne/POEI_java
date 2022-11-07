
class ConditionTwoAir {
    // Anne-Isabelle

    public static void main(String[] args) {

        String nom = "toto";
        int age = 19;

        if (nom == "toto") {
            if (age >= 18) {
                System.out.println(nom + " est majeur");
            } else {
                System.out.println(nom + " fait des bêtises");
            }
        } else {
            if (age >= 18)
                System.out.println(nom + " est majeur");
            else if (age < 16)
                System.out.println(nom + " va à l'école");
            else
                System.out.println(nom + " est mineur");
        }
    }
}