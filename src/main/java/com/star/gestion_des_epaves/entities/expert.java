package com.star.gestion_des_epaves.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.star.gestion_des_epaves.user.entities.User;
@Entity
public class expert extends User implements Serializable {
	@Id
	private long id_expert ;
	private boolean test ;
	
	public long getId_expert() {
		return id_expert;
	}
	public void setId_expert(long id_expert) {
		this.id_expert = id_expert;
	}
	public boolean isTest() {
		return test;
	}
	public void setTest(boolean test) {
		this.test = test;
	}
	public expert() {};
	public expert (Long cin, String firstName, String lastName, Date date_naiss, String genre, String tel, String etat_civil, String societe, String localite, String mail, boolean test) {
	super ();
	this.test=test;
	}
	
}
