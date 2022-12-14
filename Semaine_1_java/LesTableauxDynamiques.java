import java.util.ArrayList;

class LesTableauxDynamiques {
    // Xavier

    public static void main(String[] args) {

         // create dynamic array
         ArrayList<String> poissons = new  ArrayList<String>();

         // fill dynamic array
         poissons.add( "sardine" );
         poissons.add( "maquereau" );
         poissons.add( "tétradon" );
         poissons.add( "espadon" );

         // get size of dynamic array 
        Integer sizeOfArray = poissons.size();
        System.out.println( sizeOfArray );

        for( int i = 0 ; i < sizeOfArray ; i++ )
        {
            String poisson = poissons.get(i);  
            System.out.println( String.format( "n° %d  : %s ", i, poisson    )     );
        }

        for (String poisson : poissons) {
            System.out.println(   poisson  );
        }
    }
}