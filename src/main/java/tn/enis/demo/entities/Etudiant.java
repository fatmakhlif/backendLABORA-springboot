package tn.enis.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Date ;


@Entity @DiscriminatorValue("etd")
public class Etudiant extends Member implements Serializable {
	private Date dateInscription ;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Etudiant(String cin, String nom, String prenom, java.util.Date date, byte[] photo, String cv,
			String password, java.util.Date dateInscription, String diplome) {
		super(cin, nom, prenom, date, photo, cv, password);
		this.dateInscription = dateInscription;
		Diplome = diplome;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public String getDiplome() {
		return Diplome;
	}
	public void setDiplome(String diplome) {
		Diplome = diplome;
	}
	private String Diplome ;
	@ManyToOne
	private EnseignantChercheur encadrant;
	

}
