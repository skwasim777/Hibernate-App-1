package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hiber.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student student = session.get(Student.class, 102);
		System.out.println(student);
		session.close();
		factory.close();

	}
}
