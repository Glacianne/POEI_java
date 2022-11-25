package entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class User {
	
	public User() {
	}
	
	private String firstName;
	private String lastName;
	private boolean isAFemale;
	
	public User(String firstName, String lastName, boolean sexe) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.isAFemale = sexe;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isAFemale() {
		return isAFemale;
	}


	public void setAFemale(boolean isAFemale) {
		this.isAFemale = isAFemale;
	}


	@Override
	public String toString() {
		if(this.isAFemale == true) {
			return "Bonjour madame" + " " + this.firstName + " " + this.lastName + ".";
		}
		return "Bonjour monsieur" + " " + this.firstName + " " + this.lastName + ".";
	}
	
	
}
