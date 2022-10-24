package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.DoctorRepository;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private DoctorRepository docRepository;
	
	@Override
	public Admin checkadminlogin(String uname, String pwd) 
	{
		return adminRepository.checkadnminlogin(uname, pwd);
	}

	@Override
	public List<Doctor> viewalldoc() 
	{
		return (List<Doctor>) docRepository.findAll();
	}

	@Override
	public void deletdoc(int id)
	{
		docRepository.deleteById(id);
		
	}

	@Override
	public Doctor viewdocbyid(int id)
	{
		return docRepository.findById(id).get();
	}

	
}
