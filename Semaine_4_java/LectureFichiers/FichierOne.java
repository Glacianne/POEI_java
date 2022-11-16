package LectureFichiers;

import java.util.*;
import java.util.ArrayList.*;
import java.io.FileReader;

/* 
nécessite :
    commons-lang3-3.1.jar
    opencsv.jar
*/

public class FichierOne {
    // Xavier

    public static void main(String[] args) {
        int EOF = -1;
        int LF = 10;
        int CR = 13;

        String file = "Figures.java";
        try {
            FileReader filereader = new FileReader(file);

            // int size = filereader.
            // for ( int i=0 ; i < 100 ; i++ )
            // System.out.print( (char) filereader.read() );

            int c;
            int nbrCar = 0;
            int nbrLin = 0;
            while (EOF != (c = filereader.read())) {
                if (c == LF) {
                    nbrLin++;
                    System.out.println(nbrLin);
                } else {
                    System.out.print((char) c);
                }

                nbrCar++;
            }
            filereader.close();
            System.out.println(nbrCar);
            System.out.println(nbrLin);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
