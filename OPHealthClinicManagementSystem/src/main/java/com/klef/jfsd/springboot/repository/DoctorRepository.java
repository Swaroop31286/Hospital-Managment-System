package com.klef.jfsd.springboot.repository;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Doctor;



@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Integer>
{
	@Query("select e from Doctor e where username=?1 and password=?2")
	public Doctor checkdoclogin(String uname,String pwd);
	
	@Query("select e from Doctor e where username=?1")
	public Doctor viewdoctor(String uname);
	
	@Transactional
	@Modifying
	@Query("update Doctor e set e.password=?1 where e.password=?2 and e.username=?3")
	public int updatedocpassword(String docnewpwd,String docoldpwd,String docuname);
}
