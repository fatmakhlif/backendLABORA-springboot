package tn.enis.demo.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;


import java.util.Date ;


@Entity @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "type_mbr", discriminatorType =
DiscriminatorType.STRING,length = 3)
public abstract class Member implements Serializable {
	
	
	public Member( String cin, String nom, String prenom, java.util.Date date, byte[] photo, String cv,
			String password) {
		super();		
		Cin = cin;
		Nom = nom;
		Prenom = prenom;
		Date = date;
		Photo = photo;
		Cv = cv;
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id ;
	private String Cin ;
	private String Nom ;
	private String Prenom ;
	private Date Date ;
	private byte[] Photo ; 
	private String Cv ;
	private String password ;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getCin() {
		return Cin;
	}
	public void setCin(String cin) {
		Cin = cin;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public byte[] getPhoto() {
		return Photo;
	}
	public void setPhoto(byte[] photo) {
		Photo = photo;
	}
	public String getCv() {
		return Cv;
	}
	public void setCv(String cv) {
		Cv = cv;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
