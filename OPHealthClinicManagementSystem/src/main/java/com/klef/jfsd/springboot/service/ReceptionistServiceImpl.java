package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Receptionist;
import com.klef.jfsd.springboot.repository.ReceptioinstRepository;

@Service
public class ReceptionistServiceImpl implements ReceptionistService 
{
	
	@Autowired
	private ReceptioinstRepository recRepository;
	
	@Override
	public Receptionist addrec(Receptionist rec) {
		return recRepository.save(rec);
	}

	@Override
	public Receptionist checkreclogin(String uname, String pwd) {
		return recRepository.checkreclogin(uname, pwd);
	}

	@Override
	public Receptionist viewrec(String uname) {
		return recRepository.viewrec(uname);
	}

}
