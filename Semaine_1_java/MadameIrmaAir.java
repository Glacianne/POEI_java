import java.util.ArrayList;

class MadameIrmaAir {
    // Anne-Isabelle

    public static int mmeIrma(String name) {
        name = name.toLowerCase();
        int number = 0;

        for (int i = 0; i < name.length(); i++) {
            number += (int) name.charAt(i) - (int) 'a' + 1;
        }
        return number % 50;
    }

    public static String preoccupation(int age) {
        String str = "";
        if (age <= 12) {
            str += " école";
        }
        if (age >= 12 && age <= 20) {
            str += " trucs d'ado";
        }
        if (age <= 30) {
            str += " conjoint";
        }
        if (age <= 40) {
            str += " enfants";
        }
        if (age <= 65) {
            str += " travail";
        }
        if (age >= 60) {
            str += " retraite";
        }
        return "Vous êtes préoccupé par" + str + ".";
    }

    public static void main(String[] args) {
        String name = "Gertrude";
        int numDeChance = mmeIrma(name);
        System.out.println(String.format("Le numéro de la chance de %s est %d", name, numDeChance));
        System.out.println(preoccupation(25));
    }
}