package com.FirtstJpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;
	private String lname;
	private String lcomany;
	
	@ManyToOne
	@JoinColumn(name = "jid")
	private coder coder;
	
	public coder getCoder() {
		return coder;
	}
	public void setCoder(coder coder) {
		this.coder = coder;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLcomany() {
		return lcomany;
	}
	public void setLcomany(String lcomany) {
		this.lcomany = lcomany;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", lcomany=" + lcomany + "]";
	}
}