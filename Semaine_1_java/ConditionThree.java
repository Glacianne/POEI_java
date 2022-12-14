
class ConditionThree {
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

        
        String noms[] = { "toto", "tata", "titi" };

        int position = 5;
        String nomAChercher = "tata";
                
        //System.out.println( noms[ position ] );
        // le AND à une proprieté séquentiel dès lors que la première partie est fausse il ne va plus évaluer  
        if ( position < noms.length && noms[ position ] == nomAChercher )
            System.out.println( String.format( "le %s est à la position %d", nomAChercher, position )   ); 
        else
            System.out.println( String.format( "le %s n'est pas à la position %d", nomAChercher, position )   ); 
    }
}