package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Receptionist;

public interface ReceptionistService 
{
	public Receptionist addrec(Receptionist rec);
	public Receptionist checkreclogin(String uname,String pwd);
	public Receptionist viewrec(String uname);
	
}
