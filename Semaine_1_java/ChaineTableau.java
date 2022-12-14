import java.util.ArrayList;

class ChaineTableau {
    // Xavier

    public static void main(String[] args) {

        String str = "Heureux comme un poisson dans l'eau à la mer !";

         // get size of String 
        Integer sizeOfString = str.length();
        System.out.println( "taille de la chaine : " + sizeOfString );

        for( int i = 0 ; i < sizeOfString ; i++ )
        {
            char charactere  = str.charAt( i );  
            int codeASCII = (int)charactere;
            int offsetMAJ_MIN = ( (int)'a' - (int)'A'  ); 
            int codeASCIIMAJ = codeASCII - offsetMAJ_MIN; 
            //System.out.println( String.format( "n° %2d  : %1c  %3d %1X" , i, charactere, codeASCII, codeASCIIMAJ    )     );
            System.out.println( String.format( "%1c %1c" , charactere, codeASCIIMAJ    )     );
        }
    }
}