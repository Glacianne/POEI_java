import java.util.*;
import java.util.ArrayList.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
nécessite :
    commons-lang3-3.1.jar
    opencsv.jar
*/

class MyFileReader  extends FileReader
{
    static Integer EOF = -1;
    static Integer LF = 10;
    static int CR = 13;
    int caractereLuEnTrop; 


    public MyFileReader(String fileName ) throws FileNotFoundException
    {
        super( fileName );
    }

    public Boolean hasNext() throws IOException
    {

        if ( EOF == ( this.caractereLuEnTrop=this.read()) )
            return false;
        return true;
    }

    public String readLine() throws IOException
    {
        int caracter;

        String res = new String();
        res += (char)this.caractereLuEnTrop;

        while ( EOF != (caracter = this.read()) )
        {
            if ( caracter == LF )
                return res;
            else
                res += (char)caracter; 
        }
        return "";
    } 
}


public class  FichierThreePOO {
    // Xavier

    public static void main(String[] args)
    {          
        //String file = "Figures.java";
        String file = "monText.txt";
        try {
            MyFileReader filereader = new MyFileReader(file);
                

            HashMap<String, Integer> occurence = new HashMap<>();

                int nbrLin = 1;
                String ligne;

                while ( filereader.hasNext() )
                {
                    ligne = filereader.readLine();

                    String[] arr = ligne.split(" ");    

                    for ( String mot : arr) {
                        if ( !mot.equals( " " ) && mot.length()>0 && !mot.equals( "\n") )
                            //System.out.println( "    ->" + ss + "<");
                            //System.out.print( ">" + ss + "< ");
                            System.out.print(  mot + " ");
                            if ( ! occurence.containsKey( mot ) )
                                occurence.put( mot, 1 );
                            else
                               occurence.put( mot, occurence.get( mot ) + 1 );
                        }

                    //System.out.println( String.format("%4d : %s", nbrLin++, ligne ) );
                }
                filereader.close();

                System.out.println(  " ====================== "   );

                for (String mot : occurence.keySet() ) {
                    System.out.println( String.format( "%3d %3d %10s ", occurence.get(mot), mot.length()==1 ? (int)mot.charAt(0) : 'X' , mot ) );  
                }
        }

        catch (Exception e) 
        {
            e.printStackTrace();
        }

    }    
}