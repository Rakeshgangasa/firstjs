package com.FirtstJpa;

import javax.persistence.Entity;

@Entity
public class RetiredEmployee extends Emplyoee{

	private float pension;
	public float getPension() {
		return pension;
	}

	public void setPension(float pension) {
		this.pension = pension;
	}	
}