package com.FirtstJpa;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App1 {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
        
        EntityManager em=emf.createEntityManager();
        
        em.getTransaction().begin();
        
        System.out.println("Connected to database");
        
        Laptop l1=new Laptop();
        //l1.setLid(1001);
        l1.setLname("Mac");
        l1.setLcomany("Apple");
        //em.persist(l1);
        
        Laptop l3=new Laptop();
        //l3.setLid(1003);
        l3.setLname("HP");
        l3.setLcomany("HP");
        
        Laptop l2=new Laptop();
        //l2.setLid(1002);
        l2.setLname("Lenovo Legion");
        l2.setLcomany("Lenovo");
        //em.persist(l2);
        
        List<Laptop> laplist =new ArrayList<Laptop>();
        
        laplist.add(l1);
        laplist.add(l2);
        
        
       List<Laptop> laplist1 =new ArrayList<Laptop>();
        
        laplist1.add(l3);
        
		
		  coder c=new coder(); 
		  //c.setCid(103); 
		  c.setCname("Dia"); 
		  c.setTech("Java");
		  c.setLaptop(laplist);
		  l1.setCoder(c);
		  
		  em.persist(c);
		  
		  coder c1=new coder(); 
		  //c1.setCid(102); 
		  c1.setCname("Pia");
		  c1.setTech("JavaFS");
		  c1.setLaptop(laplist1);
		  l2.setCoder(c1);
		  em.persist(c1);
		  
		  em.getTransaction().commit();

	}

}