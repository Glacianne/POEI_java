package org.example;

import org.example.model.Agence;
import org.example.model.Client;
import org.example.model.Compte;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        Client client1 = new Client();
        client1.setNom("Dujardin");
        client1.setPrenom("Jean");
        String date1 = "19/06/1972";
        Date naissance1 = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
        client1.setDate_naissance(naissance1);
        em.persist(client1);

        Client client2 = new Client();
        client2.setNom("Cotillard");
        client2.setPrenom("Marion");
        String date2 = "30/09/1975";
        Date naissance2 = new SimpleDateFormat("dd/MM/yyyy").parse(date2);
        client2.setDate_naissance(naissance2);
        em.persist(client2);

        List<Client> listeClients = new ArrayList<>();
        listeClients.add(client1);
        listeClients.add(client2);

        Agence agence1 = new Agence("rue de la moulaga");
        em.persist(agence1);

        Compte compte1 = new Compte("compte aux Caraïbes", "12345", 50.00, agence1, listeClients);
        em.persist(compte1);

        Compte compte2 = new Compte("PEL", "678910", 2.75, agence1, listeClients);
        em.persist(compte2);

        List<Compte> listeComptes = new ArrayList<>();
        listeComptes.add(compte1);
        listeComptes.add(compte2);

        client1.setComptes(listeComptes);
        client2.setComptes(listeComptes);
        agence1.setComptes(listeComptes);

        transaction.commit();

        Query q1 = em.createQuery("select c from Client c");
        Query q2 = em.createQuery("select c from Compte c");
        Query q3 = em.createQuery("select a from Agence a");

        System.out.println("Liste des clients : ");
        for (Object c : q1.getResultList()){
            Client client = (Client) c;
            System.out.println(client.getId() + " : " + client.getNom() + " " + client.getPrenom());
            for (Compte compte : client.getComptes()){
                System.out.println(compte.getLibelle() + " : " + compte.getSolde());
            }
        }
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Liste des comptes : ");
        for (Object c : q2.getResultList()){
            Compte compte = (Compte) c;
            System.out.println("- Compte numéro " + compte.getId() + " : " + compte.getLibelle() + ",\nsolde : " + compte.getSolde() + ",\nIBAN : " + compte.getIban() + ",\nadresse de l'agence : " + compte.getAgence().getAdresse());
            for (Client client : compte.getClients()){
                System.out.println(client.getNom() + " " + client.getPrenom());
            }
        }
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Liste des agences : ");
        for (Object a : q3.getResultList()){
            Agence agence = (Agence) a;
            System.out.println(agence.getId() + " : " + agence.getAdresse());
            for (Object c : agence.getComptes()){
                Compte compte = (Compte) c;
                System.out.println("- Compte numéro " + compte.getId() + " : " + compte.getLibelle() + ",\nsolde : " + compte.getSolde() + ",\nIBAN : " + compte.getIban());
                for(Object cl : compte.getClients()){
                    Client client = (Client) cl;
                    System.out.println(client.getNom() + " " + client.getPrenom());
                }
            }
        }
        System.out.println("----------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        transaction.begin();

        System.out.println("Ajout d'un nouveau client\nVeuillez entrer votre nom : ");
        String nom1 = scanner.next();
        System.out.println("prénom : ");
        String prenom1 = scanner.next();

        Client cl1 = new Client(nom1, prenom1);
        em.persist(cl1);

        listeClients.add(cl1);

        transaction.commit();

        Query q4 = em.createQuery("select c from Client c");

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Liste des clients : ");
        for (Object c : q4.getResultList()){
            Client client = (Client) c;
            System.out.println(client.getId() + " : " + client.getNom() + " " + client.getPrenom());
        }
        System.out.println("----------------------------------------------------------------------");

        scanner.close();
        em.close();
        emf.close();
    }
}