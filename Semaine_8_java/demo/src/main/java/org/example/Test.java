package org.example;

import org.example.model.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Demojpa");
        EntityManager em = emf.createEntityManager();

        EntityTransaction trx = em.getTransaction();

        trx.begin();

        //Partie 1
        Produit p1 = new Produit("addidas", "chaussures", new Date(), 50.00, 5);
        Produit p2 = new Produit("lacoste", "polo", new Date(), 70.00, 3);
        Produit p3 = new Produit("zara", "legging", new Date(), 15.50, 20);
        Produit p4 = new Produit("H&M", "bob", new Date(), 10.00, 1);
        Produit p5 = new Produit("haribo", "réglisse dégueu", new Date(), 0.00, 2);

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.persist(p5);

        trx.commit();

        //Partie 2
        Produit pFind2 = em.find(Produit.class, 2);
        System.out.println("Produit : " + pFind2.getReference() + ", " + pFind2.getMarque() + ", " + pFind2.getPrix() + "euros" );

        //Partie 3
        Produit pFind3 = em.find(Produit.class, 3);
        em.remove(pFind3);

        //Partie 4
        trx.begin();
        Produit pFind1 = em.find(Produit.class, 1);
        System.out.println("Ancien prix : " + pFind1.getPrix() + ", " + "Ancien stock : " + pFind1.getStock());
        pFind1.setPrix(100.00);
        pFind1.setStock(15);
        trx.commit();
        System.out.println("Nouveau prix : " + pFind1.getPrix() + ", " + "Nouveau stock : " + pFind1.getStock());

        em.close();
        emf.close();
    }
}
