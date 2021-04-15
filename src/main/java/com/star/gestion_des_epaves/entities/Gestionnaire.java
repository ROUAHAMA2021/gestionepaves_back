package com.star.gestion_des_epaves.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.star.gestion_des_epaves.user.entities.User;
@Entity
public class Gestionnaire extends User implements Serializable {
	@Id
	private long id_Gestionnaire ;
	private boolean test ;
	
	
	public Gestionnaire() {
		
	};
	
	
	public long getId_Gestionnaire() {
		return id_Gestionnaire;
	}
	public void setId_Gestionnaire(long id_Gestionnaire) {
		this.id_Gestionnaire = id_Gestionnaire;
	}
	public boolean isTest() {
		return test;
	}
	public void setTest(boolean test) {
		this.test = test;
	}
	public Gestionnaire (Long cin, String firstName, String lastName, Date date_naiss, String genre, String tel, String etat_civil, String societe, String localite, String mail, boolean test) {
	super ();
	this.test=test;
	}
}