package com.duranco.model.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
@Entity
public class Hashtag {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Lob
private String texte;

@ManyToMany()
private Set<Publication> publications=new HashSet<Publication>();


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getTexte() {
	return texte;
}


public void setTexte(String texte) {
	this.texte = texte;
}


public Set<Publication> getPublications() {
	return publications;
}


public void setPublications(Set<Publication> publications) {
	this.publications = publications;
}








}
