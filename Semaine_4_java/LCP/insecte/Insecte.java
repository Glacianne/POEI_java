package insecte;

import habitat.Locus;

public class  Insecte  {
 // Xavier

    private String nom;

    public Insecte( String nom )
    {
        this.nom = nom;
    }

    public String toString()
    {
        return String.format( "je suis %s (%s)", this.nom, this.getClass().getName() );
    }

    public Boolean liveIn( Locus l )
    {
        String nomClassLocus   = l.getClass().getName();        
        String nomClassInsecte = this.getClass().getName();        

        if ( nomClassInsecte.equals( "insecte.Moustique")  && nomClassLocus.equals( "habitat.Alpage"))
            return false;

        if ( nomClassInsecte.equals( "insecte.Papillon")  && nomClassLocus.equals( "habitat.Alpage"))
            return true;

        if ( nomClassInsecte.equals( "insecte.Cigale")  && nomClassLocus.equals( "habitat.Plaine"))
            return true;

        if ( nomClassInsecte.equals( "insecte.Atlantide")  && nomClassLocus.equals( "habitat.Atlantide"))
            return true;

        System.out.println( nomClassLocus + " " + nomClassInsecte );
        return false;
    }
}

