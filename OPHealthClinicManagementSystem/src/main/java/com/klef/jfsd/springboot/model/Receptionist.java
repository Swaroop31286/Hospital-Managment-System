package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receptionist_table")
public class Receptionist 
{
	  @Id
	  @GeneratedValue
	  private int rid;
	  @Column(nullable = false,length = 200)
	  private String username;
	  @Column(nullable = false,length = 200)
	  private String password;
	@Override
	public String toString() {
		return "Receptionist [rid=" + rid + ", username=" + username + ", password=" + password + "]";
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
