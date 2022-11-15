import java.util.*;

import insecte.*;
//import insecte.Cigale;

import habitat.*; 
//import habitat.Plaine; 

// Le Collectioneur de Papillon
class  LCP {
 // Xavier

    public static void main(String[] args)
    {
        habitat.Atlantide aaL = new habitat.Atlantide( "Royaume" );
        insecte.Atlantide aaI = new insecte.Atlantide( "Atlantus" );

        Alpage a1 = new Alpage( "Blanche" );
        Plaine l1 = new Plaine( "Provence" );

        Papillon p1 = new Papillon(  "bombyx"  );        
        Cigale c1 = new Cigale(  "midi"  );
        Moustique m1 = new Moustique(  "zz zz"  );

        System.out.println(  p1.liveIn( a1  ) );
        System.out.println(  c1.liveIn( l1  ) );
        System.out.println(  a1.has( p1  ) );
        System.out.println(  l1.has( c1  ) );
        System.out.println(  a1.has( m1  ) );
        System.out.println(  m1.liveIn( a1  ) );
        System.out.println(  aaL.has( aaI  ) );
        System.out.println(  m1.liveIn( aaL  ) );
    }        
}

