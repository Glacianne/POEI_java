import java.util.ArrayList;

class ChaineToUpper {
    // Xavier

    public static String chaineMAJ( String str )
    {
        String resultat = "";
        int offsetMAJ_MIN = ( (int)'a' - (int)'A'  );

        for( int i = 0 ; i < str.length() ; i++ )
        {
            char charactere  = str.charAt( i );  
            int codeASCII = (int)charactere;
            if ( codeASCII >= 97 && codeASCII <= 122 )
            {
                int codeASCIIMAJ = codeASCII - offsetMAJ_MIN; 
                resultat += (char)codeASCIIMAJ;
            }
            else if ( codeASCII == (int)'à')
            {
                int codeASCIIMAJ = (int)'A'; 
                resultat += (char)codeASCIIMAJ;
            }
            else
            {
                resultat += (char)codeASCII;
            }
        }
        return resultat;
    }


    public static void main(String[] args) {

        String str = "Heureux comme un poisson dans l'eau à la mer !";

        //String resultat = chaineMAJ( str );
        String resultat = str.toUpperCase();
        System.out.println( resultat );
    }
}