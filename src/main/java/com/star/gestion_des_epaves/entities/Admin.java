package com.star.gestion_des_epaves.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.star.gestion_des_epaves.user.entities.User;
@Entity
public class Admin extends User implements Serializable {
	@Id
	private long id_Admin ;
	private boolean test ;
	
	public long getId_Admin() {
		return id_Admin;
	}
	public void setId_Admin(long id_Admin) {
		this.id_Admin = id_Admin;
	}
	public boolean isTest() {
		return test;
	}
	public void setTest(boolean test) {
		this.test = test;
	}
	public Admin() {};
	public Admin (Long cin, String firstName, String lastName, Date date_naiss, String genre, String tel, String etat_civil, String societe, String localite, String mail, boolean test) {
	super ();
	this.test=test;
	}
}