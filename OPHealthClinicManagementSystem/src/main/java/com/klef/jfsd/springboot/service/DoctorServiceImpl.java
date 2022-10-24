package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService
{
	@Autowired
	private DoctorRepository docRepository;

	@Override
	public Doctor adddoc(Doctor doc)
	{
		return docRepository.save(doc);
		
	}

	@Override
	public Doctor checkdoclogin(String uname, String pwd) 
	{
		return docRepository.checkdoclogin(uname, pwd);
	}

	@Override
	public Doctor viewdoc(String uname) 
	{
		
		return docRepository.viewdoctor(uname);
	}

	@Override
	public int changedocpassword(String empoldpwd, String empnewpwd, String euname)
	{
		return docRepository.updatedocpassword(empnewpwd, empoldpwd, euname);
	}
}
