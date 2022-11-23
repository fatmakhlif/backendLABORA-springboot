package tn.enis.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enis.demo.entities.Etudiant;
@Repository 
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}
