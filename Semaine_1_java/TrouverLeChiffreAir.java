import java.util.Scanner; // Import the Scanner class

class TrouverLeChiffreAir {
    // Anne-Isabelle

    public static void jeu() {
        int randomNum = (int) (Math.random() * 10);
        String number;
        int saisie = -1;
        int essais = 0;
        System.out.println("Trouve mon nombre entre 0 et 10");
        do {
            number = clavier.nextLine();
            try {
                saisie = Integer.parseInt(number);
                essais++;
                if (saisie < randomNum) {
                    System.out.println("Il faut voir plus grand !");
                } else if (saisie > randomNum) {
                    System.out.println("Plus petit !");
                } else {
                    System.out.println("Félicitations tu as trouvé en " + essais + " tentatives !");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Veuillez entrer un NOMBRE entre 0 et 10");
            }
        } while (saisie != randomNum);
    }

    public static Scanner clavier;

    public static void main(String[] args) {
        clavier = new Scanner(System.in);
        while (true) {
            jeu();
            System.out.println("Veux-tu rejouer ? y/n");
            String reponse = clavier.nextLine();
            if (!reponse.equals("y")) {
                break;
            }
        }
        System.out.println("Merci d'avoir joué");
        clavier.close();
    }
}