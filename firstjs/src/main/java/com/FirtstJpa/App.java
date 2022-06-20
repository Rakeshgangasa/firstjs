package com.FirtstJpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class App {
	public static void main(String[] args) {
		
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		  
		  EntityManager em = emf.createEntityManager();
		  
		  em.getTransaction().begin();
		  
		  System.out.println("Connected to database");
		  
		  
			/*
			 * coder c=new coder(); c.setCid(103); c.setCname("Dia"); c.setTech("Java");
			 * 
			 * em.persist(c);
			 * 
			 * coder c1=new coder(); c1.setCid(102); c1.setCname("Pia");
			 * c1.setTech("JavaFS");
			 * 
			 * em.persist(c1);
			 */
		  coder c3=em.find(coder.class, 101); System.out.println(c3);
		  
		  
		  
		  c3.setCname("Sia"); c3.setTech("Python");
		  
		  em.persist(c3);
		  
		  
		  // em.detach(c3);
		  
		  //c3.setCname("Ria");
		  
		  //System.out.println(c3); em.merge(c3); em.flush();
		  
		  //em.persist(c3);
		  
		  
		  
		  coder c4=em.find(coder.class, 102); System.out.println(c4);
		  
		  //em.remove(c4); // em.persist(c4); Not Possible
		  
		  
			/*
			 * Query q = em.createQuery("select c from coder c"); List<coder> lc
			 * =q.getResultList(); System.out.println(lc); Query q1
			 * =em.createQuery("select c from coder c where cid=103"); coder c5 =
			 * (coder)q1.getSingleResult(); System.out.println(c5.getCname()); Query
			 * q2=em.createQuery("update coder set cname='pia' where cid=103"); int
			 * i=q2.executeUpdate(); System.out.println("Record Updated"+i);
			 * 
			 * TypedQuery<coder> tq=em.createQuery("select  c from Coder c where cid=103",
			 * coder.class);
			 * 
			 * coder c6=tq.getSingleResult();
			 * 
			 * System.out.println(c6);
			 */
		  
		  em.getTransaction().commit();
		 

	}
}
