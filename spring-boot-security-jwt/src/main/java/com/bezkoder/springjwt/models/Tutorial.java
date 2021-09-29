package com.bezkoder.springjwt.models;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "status")
	private boolean status;

	public Tutorial() {

	}
	
	public Tutorial(String name, boolean status) {
		this.name = name;
		this.status = status;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", name=" + name + ", status=" + status + "]";
	}

	

}
