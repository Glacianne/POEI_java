import java.util.*;
import java.util.ArrayList.*;

class Ligne
{
    // variables d'instance'
    private String libel            = "";
    private Double prixUnitaire     = 0.0;
    private Double quantite         = 0.0;
    private Double prixTot          = 0.0;

    // variable de classe
    static Integer nbrLigne = 0;  


    public Ligne( String nom, Double pu, Double qte   )
    {
        this.libel          = nom;        
        this.prixUnitaire   = pu;        
        this.quantite       = qte;
        calculTotal();        
        nbrLigne++;
    } 

    public void affLigne()
    {
        System.out.println(  String.format("%15s %8.2f %8.2f = %8.2f",   this.libel, this.prixUnitaire, this.quantite, this.prixTot     ) );
    }

    public void setQuantite( Double qte )
    {
        this.quantite = qte;
        calculTotal();        
    }

    public Double getQuantite( )
    {
        return this.quantite;      
    }

    public Double getTotalLigne( )
    {
        return this.prixTot;      
    }

    private void calculTotal()
    {
        this.prixTot  = this.quantite * this.prixUnitaire;
    }

}

class Ticket
{
    // variables d'instance'
    String client            = "inconnu";
    Double prixTot           = 0.0;
    ArrayList<Ligne> lignes  = new ArrayList();

    static Integer nbrObjet = 0;
    {
        nbrObjet +=1;
    }

    public Ticket( String nomClient )
    {
        this.client = nomClient;
    } 

    public Ticket( )
    {
    } 


    public void addAchat(  Ligne l  )
    {
        lignes.add( l );
    }

    public void affTotal()
    {
        Double res = 0.0;
        for (Ligne l : lignes ) 
        {
            res += l.getTotalLigne();
        }
        System.out.println(  String.format("TOTAL : %8.2f",   res ) );
    }

    public void afffiche()
    {
        System.out.println(  "============================= " );
        System.out.println(  String.format("client : %15s",   this.client  ) );

        for( int i=0 ; i < lignes.size() ; i++ ) 
        {
            System.out.print( i );
            lignes.get(i).affLigne();
        }
        /* 
        for (Ligne l : lignes ) 
        {
            l.affLigne();
        }*/        
        System.out.println(  "============================= " );
    }
}


class TicketCaissePOOOne {
    // Xavier

    public static void main(String[] args) {

        Ticket t1 = new Ticket();
        t1.addAchat( new Ligne("romarin", 7.56, 1.0 ) );
        t1.addAchat( new Ligne("romarin", 7.56, 1.0) );
        t1.addAchat( new Ligne("rutabaga", 1.5, 5.0));
        t1.addAchat( new Ligne("choux de Brx", 4.50, 1.0));
        t1.addAchat( new Ligne("réglisse", 8.75, 0.5));
        t1.addAchat( new Ligne("bettes", 2.4, 1.0));
        t1.afffiche();
        t1.affTotal();

        Ticket t2 = new Ticket();
        t2.addAchat( new Ligne("livre", 7.56, 1.0 ) );
        t2.addAchat( new Ligne("essence", 7.56, 1.0) );
        t2.addAchat( new Ligne("fil à coudre", 1.5, 5.0));
        t2.addAchat( new Ligne("banane", 4.50, 1.0));
        t2.afffiche();
        t2.affTotal();

        Ligne l1 = new Ligne("tomate", 3.55, 1.0 );

        l1.affLigne();
        l1.setQuantite( l1.getQuantite() + 5   );
        l1.affLigne();

        System.out.println(  String.format("nombre de lignes :  %d ", Ligne.nbrLigne  ) );
        System.out.println(  String.format("nombre de Ticket :  %d ", Ticket.nbrObjet  ) );
    }
}