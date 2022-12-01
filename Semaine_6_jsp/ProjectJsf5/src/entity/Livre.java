package entity;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Livre")
@ManagedBean(name="Livre")
@SessionScoped
public class Livre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "titre")
	private String titre;

	@Column(name = "auteur")
	private String auteur;

	@Column(name = "date")
	private Date date;

	@Column(name = "prix")
	private double prix;

	public Livre() {
	}

	public Livre(String titre, String auteur, Date date, double prix) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.date = date;
		this.prix = prix;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

}
