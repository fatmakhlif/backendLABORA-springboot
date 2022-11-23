package tn.enis.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.enis.demo.dao.EnseignantChercheurRepository;
import tn.enis.demo.dao.EtudiantRepository;
import tn.enis.demo.entities.EnseignantChercheur;
import tn.enis.demo.entities.Etudiant;

@SpringBootApplication
public class MemberApplication implements CommandLineRunner{
	@Autowired
	EtudiantRepository etudiantrepo ;
	EnseignantChercheurRepository enseignantrepo ;

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(MemberApplication.class, args);
		
	}



	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat  dateFormatter = new SimpleDateFormat("yyyy-mm-dd");
		
		Date date1 = dateFormatter.parse("2022-05-01");
		Date date2 = dateFormatter.parse("2022-06-01");
		Date date3 = dateFormatter.parse("2022-07-01");

	
	
	Etudiant fatma = new Etudiant("11127749","khlif","fatma",date1,null,"","fafa",date2,"engenieur");
	Etudiant emna = new Etudiant("11127749","khlif","emna",date1,null,"","fafa",date2,"bac");

	EnseignantChercheur en1 = new EnseignantChercheur("11127749","khlif","emna",date1,null,"","fafa","chercheur","doctorant");
	 etudiantrepo.save(fatma);
	}}
