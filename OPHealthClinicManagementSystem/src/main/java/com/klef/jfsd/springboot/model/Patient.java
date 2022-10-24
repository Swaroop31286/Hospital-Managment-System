package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_table")
public class Patient 
{
	@Id
	  @GeneratedValue
	   private int pid;
	  @Column(nullable = false,length = 200)
	   private String pname;
	  @Column(nullable = false,length = 10)
	   private String pgender;
	  @Column(nullable = false,length = 10)
	  private String pdateofbirth;
	  @Column(nullable = false,length = 200)
	  private String phealthissue;
	  @Column(nullable = false,length = 200)
	   private String plocation;
	  @Column(nullable = false,unique = true,length = 200)
	  private String pemailid;
	  @Column(nullable = false,unique = true,length = 200)
	   private String pusername;
	  @Column(nullable = false,length = 200)
	   private String password;
	  @Column(nullable = false,length = 200)
	  private String pcontactno;
	  
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPgender() {
		return pgender;
	}
	public void setPgender(String pgender) {
		this.pgender = pgender;
	}
	public String getPdateofbirth() {
		return pdateofbirth;
	}
	public void setPdateofbirth(String pdateofbirth) {
		this.pdateofbirth = pdateofbirth;
	}
	public String getPhealthissue() {
		return phealthissue;
	}
	public void setPhealthissue(String phealthissue) {
		this.phealthissue = phealthissue;
	}
	public String getPlocation() {
		return plocation;
	}
	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	public String getPemailid() {
		return pemailid;
	}
	public void setPemailid(String pemailid) {
		this.pemailid = pemailid;
	}
	public String getPusername() {
		return pusername;
	}
	public void setPusername(String pusername) {
		this.pusername = pusername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPcontactno() {
		return pcontactno;
	}
	public void setPcontactno(String pcontactno) {
		this.pcontactno = pcontactno;
	}
}
