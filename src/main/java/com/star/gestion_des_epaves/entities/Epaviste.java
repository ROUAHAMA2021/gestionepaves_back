package com.star.gestion_des_epaves.entities;

	import java.io.Serializable;
import java.util.Date;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import com.star.gestion_des_epaves.user.entities.User;
	@Entity
	public class Epaviste extends User implements Serializable {
		@Id
		private long id_Epaviste ;
		private boolean test ;
		
		public long getId_Epaviste() {
			return id_Epaviste;
		}
		public void setId_Epaviste(long id_Epaviste) {
			this.id_Epaviste = id_Epaviste;
		}
		public boolean isTest() {
			return test;
		}
		public void setTest(boolean test) {
			this.test = test;
		}
		public Epaviste() {};
		public Epaviste (Long cin, String firstName, String lastName, Date date_naiss, String genre, String tel, String etat_civil, String societe, String localite, String mail, boolean test) {
		super ();
		this.test=test;
		}
	}
