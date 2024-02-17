package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmdDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hiber.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Student s = new Student();
		s.setId(102);
		s.setName("salman");
		s.setClgName("ssm");
		s.setCity("manjalgaon");

		Certificate certificate = new Certificate();
		certificate.setCourse("java");
		certificate.setDuaration(2);
		s.setCertificate(certificate);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(s);
		transaction.commit();
		session.close();
		factory.close();
	}
}
