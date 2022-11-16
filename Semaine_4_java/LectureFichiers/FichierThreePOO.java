package LectureFichiers;

import java.util.*;
import java.util.ArrayList.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class MyFileReader extends FileReader {
    static Integer EOF = -1;
    static Integer LF = 10;
    static int CR = 13;
    int caractereLuEnTrop;

    public MyFileReader(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public Boolean hasNext() throws IOException {

        if (EOF == (this.caractereLuEnTrop = this.read()))
            return false;
        return true;
    }

    public String readLine() throws IOException {
        int caracter;

        String res = new String();
        res += (char) this.caractereLuEnTrop;

        while (EOF != (caracter = this.read())) {
            if (caracter == LF)
                return res;
            else
                res += (char) caracter;
        }
        return "";
    }
}

public class FichierThreePOO {
    // Anne-Isabelle

    public static void main(String[] args) {
        String file = "LectureFichiers/Figures.java";
        try {
            MyFileReader filereader = new MyFileReader(file);

            // int nbrLin = 1;
            String ligne;

            while (filereader.hasNext()) {
                ligne = filereader.readLine();

                // String[] words = ligne.split(" ");
                // for (String word : words) {
                // if (!word.equals(" ") && word.length() > 0 && !word.equals("\n"))
                // System.out.print(word + "-");
                // }

                String fichier = "LectureFichiers/MonText";
                Hashtable<String, Integer> tableMotCle = new Hashtable<String, Integer>();

                try {
                    // Connexion au fichier
                    BufferedReader br = new BufferedReader(new FileReader(fichier));

                    while ((ligne = br.readLine()) != null) {
                        ligne = ligne.toLowerCase();
                        // On découpe la ligne mot à mot
                        StringTokenizer st = new StringTokenizer(ligne, " ,.;:_@+*//*\\.;\n\"\'{}()=><\t!?");
                        while (st.hasMoreTokens()) {
                            String str = st.nextToken(); // Tu sauvegardes le premier token dans une variable

                            if (tableMotCle.containsKey(str))// Tu testes et utilises la variable (donc toujours le même
                                                             // token)
                            {
                                tableMotCle.put(str, (tableMotCle.get(str) + 1));
                            } else {
                                tableMotCle.put(str, 1);
                            }
                        }
                    }
                    br.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                System.out.println(tableMotCle.size());
                System.out.println(tableMotCle.toString());

                // System.out.println(String.format("%4d : %s", nbrLin++, ligne));
            }
            filereader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}