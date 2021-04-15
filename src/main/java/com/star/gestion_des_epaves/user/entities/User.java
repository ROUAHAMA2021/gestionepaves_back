package com.star.gestion_des_epaves.user.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Entity
//@Data
//@Inheritance(strategy= InheritanceType.JOINED) 
public class User implements Serializable {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long user_id;
	private Long cin;
	    private String firstName;
	    private String lastName;
	    private Date date_naiss;
	    private String genre;
	    private String tel;
	    private String etat_civil;
	    private String societe;
	    private String localite;
	    private String mail;
	    
	    
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getUser_id() {
			return user_id;
		}
		public void setUser_id(Long user_id) {
			this.user_id = user_id;
		}
		public Long getCin() {
			return cin;
		}
		public void setCin(Long cin) {
			this.cin = cin;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Date getDate_naiss() {
			return date_naiss;
		}
		public void setDate_naiss(Date date_naiss) {
			this.date_naiss = date_naiss;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getEtat_civil() {
			return etat_civil;
		}
		public void setEtat_civil(String etat_civil) {
			this.etat_civil = etat_civil;
		}
		public String getSociete() {
			return societe;
		}
		public void setSociete(String societe) {
			this.societe = societe;
		}
		public String getLocalite() {
			return localite;
		}
		public void setLocalite(String localite) {
			this.localite = localite;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		
		
		public User(Long user_id, Long cin, String firstName, String lastName, Date date_naiss, String genre,
				String tel, String etat_civil, String societe, String localite, String mail) {
			super();
			this.user_id = user_id;
			this.cin = cin;
			this.firstName = firstName;
			this.lastName = lastName;
			this.date_naiss = date_naiss;
			this.genre = genre;
			this.tel = tel;
			this.etat_civil = etat_civil;
			this.societe = societe;
			this.localite = localite;
			this.mail = mail;
		}
		@Override
		public String toString() {
			return "User [user_id=" + user_id + ", cin=" + cin + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", date_naiss=" + date_naiss + ", genre=" + genre + ", tel=" + tel + ", etat_civil=" + etat_civil
					+ ", societe=" + societe + ", localite=" + localite + ", mail=" + mail + "]";
		}
	    
		
	   
	    
}
