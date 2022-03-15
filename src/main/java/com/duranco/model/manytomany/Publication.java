package com.duranco.model.manytomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Publication {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String titre;
private String description;

private String contenu;
@ManyToMany(fetch = FetchType.LAZY,
cascade = {
		CascadeType.PERSIST,
		CascadeType.MERGE
},
mappedBy = "publications"
		
		)
private Set<Hashtag> hastags=new HashSet<>(); // tableau
// arrayList list Set => tableau d'objet
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getContenu() {
	return contenu;
}
public void setContenu(String contenu) {
	this.contenu = contenu;
}
public Set<Hashtag> getHastags() {
	return hastags;
}
public void setHastags(Set<Hashtag> hastags) {
	this.hastags = hastags;
}





}
