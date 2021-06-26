package com.avanade.dio.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "USERS")
public class UserModel {

	@Id
	@Column(length = 20)
	private String username;
	
	@Column(length = 20, nullable = false)
	private String password;
	
	@Column(length = 20, nullable = false)
	private String firstName;
	
	@Column(length = 20)
	private String lastName;
	
	@Column(length = 100, nullable = false)
	private String email;

}
