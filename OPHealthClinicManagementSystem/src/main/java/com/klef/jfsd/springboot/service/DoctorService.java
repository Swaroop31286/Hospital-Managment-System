package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Doctor;

public interface DoctorService
{
	public Doctor adddoc(Doctor doc);
	public Doctor checkdoclogin(String uname,String pwd);
	public Doctor viewdoc(String uname);
	public int changedocpassword(String empoldpwd,String empnewpwd,String euname);
}
