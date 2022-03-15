package com.duranco.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String adresse;
private int age;
@Column(unique = true)
private String email;
@Enumerated(EnumType.STRING)
private Grades grade;
private String mdp;
@Column(nullable = false)
private String nom;
@Column(nullable = false)
private String prenom;
private String recrutement;
private String tel;
private float salaire;
private String login;
private String description;
@OneToOne(mappedBy = "employee")
private Salaire salaireemp;

@OneToMany(mappedBy = "employee")
private Set<Conge> conges;

public Salaire getSalaireemp() {
	return salaireemp;
}
public void setSalaireemp(Salaire salaireemp) {
	this.salaireemp = salaireemp;
}
public Set<Conge> getConges() {
	return conges;
}
public void setConges(Set<Conge> conges) {
	this.conges = conges;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Grades getGrade() {
	return grade;
}
public void setGrade(Grades grade) {
	this.grade = grade;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getRecrutement() {
	return recrutement;
}
public void setRecrutement(String recrutement) {
	this.recrutement = recrutement;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public float getSalaire() {
	return salaire;
}
public void setSalaire(float salaire) {
	this.salaire = salaire;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}





}
