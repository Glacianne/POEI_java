import java.util.*;
import java.util.ArrayList.*;

class TicketCaisseTwoAir {
    // Anne-Isabelle

    // création des list qui vont contenir les données
    static ArrayList<String> noms = new ArrayList();
    static ArrayList<Double> prixs = new ArrayList();
    static ArrayList<Double> quantites = new ArrayList();

    public static void addArticle(String nom, Double prix, Double qte) {
        noms.add(nom);
        prixs.add(prix);
        quantites.add(qte);
    }

    public static void affArticle(Integer i) {
        System.out.println(String.format("%2d -> %20s    %6.2f  %5.2f   %8.2f", i + 1, noms.get(i), prixs.get(i),
                quantites.get(i), prixs.get(i) * quantites.get(i)));
    }

    public static void afficheTicket() {
        for (int i = 0; i < noms.size(); i++)
            affArticle(i);
    }

    public static void total() {
        Double total = 0.0;
        for (int i = 0; i <= prixs.size() - 1; i++) {
            total += prixs.get(i) * quantites.get(i);
        }
        System.out.println(String.format("total : %.2f", total));
    }

    public static void remove(String article) {
        int index = noms.indexOf(article);
        noms.remove(index);
        prixs.remove(index);
        quantites.remove(index);
    }

    public static void main(String[] args) {

        addArticle("romarin", 7.56, 1.0);
        addArticle("rutabaga", 1.5, 5.0);
        addArticle("choux de Bruxelles", 4.50, 1.0);
        addArticle("réglisse", 8.75, 0.5);
        addArticle("bettes", 2.4, 1.0);

        afficheTicket();
        total();
        remove("romarin");
        afficheTicket();
        total();
    }
}
