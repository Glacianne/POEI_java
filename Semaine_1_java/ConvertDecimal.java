import java.util.ArrayList;

class ConvertDecimal {
    // Xavier

    static int convert( String str  )
    {
        int resultat = 0;
        
        for( int i=0 ; i < str.length() ; i++ )
        {
            char lettre = str.charAt( i );
            int codeZero = ((int)'0');
            resultat *= 10;
            resultat += ((int)lettre) - codeZero;
        }
        return resultat;       
    }


    public static void main(String[] args) {

        String v1Str = "10";
        String v2Str = "3";


        int v1i = Integer.parseInt(v1Str);
        int v2i = 3;
        System.out.println( "add v1 + v2 : " + (v1Str + v2Str)  );
        System.out.println( "add v1 + v2 : " + (v1i + v2i)  );
 
        System.out.println( String.format( "my Convert %d", convert( "5" ) )  );
        System.out.println( String.format( "my Convert %d", convert( "1224" ) )  );
 
 
 
    }
}