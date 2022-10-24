package com.klef.jfsd.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Receptionist;

@Repository
public interface ReceptioinstRepository extends CrudRepository<Receptionist, String>
{
	@Query("select e from Receptionist e where username=?1 and password=?2")
	public Receptionist checkreclogin(String uname,String pwd);
	
	@Query("Select e from Receptionist e where username=?1")
	public Receptionist viewrec(String uname);
	
	@Transactional
	@Modifying
	@Query("update Receptionist e set e.password=?1 where e.password=?2 and e.username=?3")
	public int updatedrecpassword(String docnewpwd,String docoldpwd,String docuname);
}
