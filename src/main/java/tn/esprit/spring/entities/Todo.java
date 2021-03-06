package tn.esprit.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@NotNull
   @Column(name="title")
	private String titre;
   @Column(name="description")
   private String description;
   @Column(name="datededebut")
   private String datededebut;
   @Column(name="datedecheance")
	private String datedecheance;
   @Column(name="status")
	private Categorie status ;
public Long getId() {
	return id;
}
public void setId(Long id) {
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
public String getDatededebut() {
	return datededebut;
}
public void setDatededebut(String datededebut) {
	this.datededebut = datededebut;
}
public String getDatedecheance() {
	return datedecheance;
}
public void setDatedecheance(String datedecheance) {
	this.datedecheance = datedecheance;
}

public Categorie getStatus() {
	return status;
}
public void setStatus(Categorie status) {
	this.status = status;
}
@Override
public String toString() {
	return "Todo [id=" + id + ", titre=" + titre + ", description=" + description + ", datededebut=" + datededebut
			+ ", datedecheance=" + datedecheance + ", status=" + status + "]";
}
   
   
}
