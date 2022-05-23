package com.casestudy.usermetadata.Entity;

import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserMetaData {

	@Transient
	public static final String SEQUENCE_SAVE = "users_sequence";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	private String id;
	
	@NotEmpty
	@NotBlank
	@Size(min=5)
	private String name;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	@NotBlank
	private String phoneNo;
	
	@NotEmpty
	@NotBlank
	private String password;
	
	public UserMetaData() {
		super();
	}

	public UserMetaData(String id, String name, String email, String phoneNo, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static String getSequenceSave() {
		return SEQUENCE_SAVE;
	}
		
}
