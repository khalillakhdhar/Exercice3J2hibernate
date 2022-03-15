package com.duranco.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Salaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double brute;
	private double nette;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idemp", referencedColumnName = "id")
	private Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBrute() {
		return brute;
	}

	public void setBrute(double brute) {
		this.brute = brute;
	}

	public double getNette() {
		return nette;
	}

	public void setNette(double nette) {
		this.nette = nette;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	

}
