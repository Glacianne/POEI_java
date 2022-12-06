package com.example.ticketcaissefinal;

import java.util.ArrayList;

public class Ticket {
    Integer tot;
    String client;
    ArrayList<Article> listeArticles = new ArrayList<>();

    public Ticket(String client) {
        this.client = client;
    }

    public Article addArticle(Article article) {
        this.listeArticles.add(article);
        return article;
    }

    public void totalTicket() {
        this.tot = 0;
        for (Article articles : this.listeArticles) {
            this.tot += articles.getPrice();
        }
    }

    public Integer getTot() {
        this.totalTicket();
        return this.tot;
    }

    public void setTot(Integer tot) {
        this.tot = tot;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public ArrayList<Article> getListeArticles() {
        return listeArticles;
    }

    public void setListeArticles(ArrayList<Article> listeArticles) {
        this.listeArticles = listeArticles;
    }
}
