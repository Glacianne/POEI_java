package habitat;

import insecte.Insecte;

public class  Locus {
 // Xavier

    private String nom;

    public Locus( String nom )
    {
        this.nom = nom;
    }
    public String toString()
    {
        return String.format( "lieu : %", this.nom); 
    }

    public Boolean has( Insecte i )
    {
        String nomClassLocus   = this.getClass().getName();        
        String nomClassInsecte = i.getClass().getName();        

        if ( nomClassInsecte.equals( "insecte.Moustique")  && nomClassLocus.equals( "habitat.Alpage"))
            return false;

        if ( nomClassInsecte.equals( "insecte.Papillon")  && nomClassLocus.equals( "habitat.Alpage"))
            return true;

        if ( nomClassInsecte.equals( "insecte.Cigale")  && nomClassLocus.equals( "habitat.Plaine"))
            return true;

        return true;
    }
}
