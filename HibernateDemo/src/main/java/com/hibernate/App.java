package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		//1.data save
		User u = new User(4,"python","ahmedabad");
		session.save(u);
		
		//2.fetch
//		User u = session.get(User.class, 3);
//		System.out.println(u);
		
		//3.update
//		User u = new User(3,"dart","delhi");
//		session.update(u);
		
		//4.delete
//		User u = new User(3,"dart","delhi");
//		session.delete(u);
		
		
		tx.commit();
		session.close();
		sf.close();
	}
}
