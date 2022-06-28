package com.gcs.auth.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="usertab")

public class User {
@Id
@GeneratedValue
	private int id;
	private  String name;
	private String username;
	private String password;
	@ElementCollection
	@CollectionTable(name="rolestab",
		joinColumns = @JoinColumn(name="id")
	)
	@Column(name="role")
	private Set<String> roles;
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
