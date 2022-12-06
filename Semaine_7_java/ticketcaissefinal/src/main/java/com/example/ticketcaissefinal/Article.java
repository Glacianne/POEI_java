package com.example.ticketcaissefinal;

public class Article {
	String item;
	Integer price;
	static int  nb_article;
	int ID;


	public Article(String item, Integer price) {
		this.item = item;
		this.price = price;
	}


	public void incrementID() {
		this.ID = nb_article++;
	}

	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public Integer getPrice() {
		return this.price;
	}


	public void setPrice(Integer prix) {
		this.price = prix;
	}


	public int getID() {
		return this.ID;
	}


	public void setID(int iD) {
		this.ID  = iD;
	}

	@Override
	public String toString() {
		return "Article{" +
				"item='" + item + '\'' +
				", price=" + price +
				", ID=" + ID +
				'}';
	}
}
