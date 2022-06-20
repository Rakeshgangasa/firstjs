package com.FirtstJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		System.out.println("Connected to Database");
		Emplyoee e1=new Emplyoee(); 
		e1.setEname("Neha"); 
		e1.setTech("JAVA");
		 em.persist(e1);
		 
		Emplyoee e2=new Emplyoee();
		e2.setEname("Puja"); 
		e2.setTech("JAVA");
		em.persist(e2);
		 
		Emplyoee e3=new Emplyoee(); 
		e3.setEname("Mina"); 
		e3.setTech("JAVA");
		em.persist(e3);
		
		 ITEmployee ite1=new ITEmployee(); 
		 ite1.setSalary(25000);
		  ite1.setEname("PUJA");
		  ite1.setTech("JAVA");
		  em.persist(ite1);
		
		  ITEmployee ite2=new ITEmployee(); 
		  ite2.setSalary(35000);
		  ite2.setEname("Neha"); 
		  ite2.setTech("AI"); 
		  em.persist(ite2);
		  
		  RetiredEmployee re1=new RetiredEmployee(); 
		  re1.setEname("Mahesh");
		  re1.setPension(20000); 
		  re1.setTech("C"); 
		  em.persist(re1);
		  em.getTransaction().commit();
	}

}