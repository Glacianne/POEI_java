import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*>25 surpoids
<18.5 sous poids
entre les deux normal*/

@ManagedBean
@SessionScoped

public class User {
	
	public User() {}
	
	private String nom;
	private int age;
	private boolean sexe;
	private double poids;
	private double taille;
	private double imc;
	
	public User(String nom, int age, boolean sexe, double poids, double taille, double imc) {
		super();
		this.nom = nom;
		this.age = age;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.imc = imc;
	}
	
	public int conseil() {
		if(this.imc < 18.5) {
			return 0;
		}else if(this.imc > 25) {
			return 2;
		}
		return 1;	
	}
	
	@Override
	public String toString() {
		if(this.sexe == true) {
			return "Madame " + this.nom + " votre IMC est de " + this.imc + ".";
		}
		return "Monsieur " + this.nom + " votre IMC est de " + this.imc + ".";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSexe() {
		return sexe;
	}

	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public double getImc() {
		return imc;
	}

	public void setImc() {
		this.imc = poids/(taille*taille);
	}
	
}
