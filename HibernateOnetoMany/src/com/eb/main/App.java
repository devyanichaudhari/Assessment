package com.eb.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.eb.entity.Cart1;
import com.eb.entity.Items1;

public class App {

	public static void main(String[] args) {

		Cart1 c1=new Cart1();
		c1.setName("Amazon");
	//Items1( String itemId, double itemTotal, int quantity, Cart1 cart1) 
		Items1 i1=new Items1("Bag",500,1,c1);
		Items1 i2=new Items1("HD",25000,1,c1);
		Items1 i3=new Items1("Stationary",1500,1,c1);
		
		Set<Items1>itemset=new HashSet<Items1>();
		itemset.add(i1);
		itemset.add(i2);
		itemset.add(i3);
		
		c1.setItems1(itemset);
		c1.setTotal(500*1+25000*3+2700*1);
		SessionFactory sessionFactory = null;
		//Session is interface between java class and hibernate it will help save object and commit transaction
		Session session = null;
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.getCurrentSession();
 //create the session object
		session.beginTransaction();
		//create the transaction from the session object

		session.save(c1); 
		// save the vehicle entity to the database
		session.save(i1);
		session.save(i2);
		session.save(i3);
		// save the user entity to the database

		session.getTransaction().commit(); 
		//close the transaction
		session.close(); 	
	}

}