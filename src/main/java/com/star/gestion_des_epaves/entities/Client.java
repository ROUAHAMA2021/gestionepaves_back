package com.star.gestion_des_epaves.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.star.gestion_des_epaves.user.entities.User;
@Entity
public class Client extends User implements Serializable {
	@Id
	private long id_Client ;
	private boolean test ;
	
	
	public long getId_Client() {
		return id_Client;
	}
	public void setId_Client(long id_Client) {
		this.id_Client = id_Client;
	}
	public boolean isTest() {
		return test;
	}
	public void setTest(boolean test) {
		this.test = test;
	}
	public Client() {
		}
	public Client (Long cin, String firstName, String lastName, Date date_naiss, String genre, String tel, String etat_civil, String societe, String localite, String mail, boolean test) {
	super ();
	this.test=test;
	}
}
