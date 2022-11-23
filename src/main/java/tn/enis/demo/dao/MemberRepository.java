package tn.enis.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enis.demo.entities.Member;
@Repository 
public interface MemberRepository  extends  JpaRepository<Member,Long> {

}
