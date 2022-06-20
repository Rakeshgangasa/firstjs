package com.FirtstJpa;
import javax.persistence.Entity;

@Entity
public class ITEmployee extends Emplyoee
{
	private float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}