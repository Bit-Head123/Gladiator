package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
@SequenceGenerator(name = "adminseq", sequenceName = "seq_admin", initialValue = 100, allocationSize = 1)
public class Admin {

	@Id
	@GeneratedValue(generator = "adminseq",strategy = GenerationType.SEQUENCE)
	@Column(name = "admin_id")
	private int id;
	
	@Column(length = 30)
	private String username;
	
	@Column(length = 30)
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
