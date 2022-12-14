
class OperatorOne {
    // Xavier

    public static void main(String[] args) {


        /*
        * 
        *               !   ->  not (inverse l'état du booleen)
        *              ==   ->  egal
        *              !=   ->  not egal
        *              >    ->  strictement superieur à 
        *              <    ->  strictement inférieur à 
        *              >=   ->  superieur ou égal à 
        *              <=   ->  inférieur ou égal à 
        * 
        *              &&   ->  and  et              
        *              ||   ->  or   ou           
        *              ^^   ->  xor  ou exclusif            
        */

        /*
         * 
         *         operateur binaire
         *              en ordre croissant de priorité
         * 
         *              +   add  (commutatif)
         *              -   sub
         * 
         *              *   mul  (commutatif)
         *              /   div  
         *              %   mod  modulo  
         * 
         *              &   and 
         *              |   or
         *              ^   xor
         *
         *              >>    decalage des bits sur la droite 
         *              >>>   decalage des bits sur la droite (sans impact sur le bit le + à gauche) 
         *              <<    decalage des bits sur la gauche
         *  
         *              
         *         operateur unaire
         *              ! 
         *              ~  complement à 1
         *         operateur ternaire
         *              bool ?  A  : B
         *                              // presque équivalent à if ( bool ) A else B 
         * 
         * 
         */

         // operator modulo 
         int reste =  10 % 3; 
         System.out.println( reste  );

        for( int i=10 ; i<30 ; i++ ) 
            System.out.println( String.format(" %d %c 4 = %d " , i,  '%', i%4 )  );
 
        String noms[] = { "toto", "tata", "titi", "tutu" };
        for ( int i=0 ; i<25 ; i++ )
            System.out.println( "je donne un bonbon à " + noms[ i%4 ]  );

        System.out.println( "------------------------------------");
         // operator and & 
         int v1 =  12; 
         int v2 =  10; 
         System.out.println( String.format(" %s & %s = %s " , Integer.toBinaryString( v1 ), Integer.toBinaryString( v2 ),  Integer.toBinaryString( v1 & v2 ) )  );
         System.out.println( String.format(" %s | %s = %s " , Integer.toBinaryString( v1 ), Integer.toBinaryString( v2 ),  Integer.toBinaryString( v1 | v2 ) )  );
         System.out.println( String.format(" %s ^ %s = %s " , Integer.toBinaryString( v1 ), Integer.toBinaryString( v2 ),  Integer.toBinaryString( v1 ^ v2 ) )  );


            System.out.println( "------------------------------------");

            int etatLumiere = 128;

            // |0|0|0|0|0|0|0|0| 

        System.out.println( String.format(" %s" , Integer.toBinaryString( etatLumiere ))  );
        etatLumiere = etatLumiere | 2;
        System.out.println( String.format(" %s" , Integer.toBinaryString( etatLumiere ))  );
        etatLumiere = etatLumiere | 8;
        System.out.println( String.format(" %s" , Integer.toBinaryString( etatLumiere ))  );
        etatLumiere = etatLumiere  & 253;
        System.out.println( String.format(" %s" , Integer.toBinaryString( 253 ))  );
        System.out.println( String.format(" %s" , Integer.toBinaryString( etatLumiere ))  );
        etatLumiere = etatLumiere ^ 255;
        System.out.println( String.format(" %s" , Integer.toBinaryString( etatLumiere ))  );
        etatLumiere = etatLumiere ^ 255;
        System.out.println( String.format(" %s" , Integer.toBinaryString( etatLumiere ))  );
        System.out.println( "------------------------------------");

        int var = -100; // 1010
        System.out.println( String.format(" %d %s", var , Integer.toBinaryString( var ))  );
        var = var >> 1;
        System.out.println( String.format(" %d %s", var , Integer.toBinaryString( var ))  );

        System.out.println( "------------------------------------");

        int a = 3;
        int res = 5 + (2 / 2);
        res = -5 + (--a * 3) + --a ;
        System.out.println( String.format(" %d ", res )  );
    }
}