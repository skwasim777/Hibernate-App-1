package com.hiber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Started.....");
		Configuration cfg = new Configuration();
		cfg.configure("hiber.xml");
		SessionFactory session = cfg.buildSessionFactory();

		Student st = new Student();
		st.setId(102);
		st.setName("Salman");
		st.setClgName("SSM College");
		st.setCity("Manjalgaon");
		System.out.println(st);
		// creating object of address class
		Address add = new Address();
		add.setStreet("Hafizpet");
		add.setCity("Hyderbad");
		add.setOpen(true);
		add.setX(1234.99);
		add.setDate(new Date());
		FileInputStream f = new FileInputStream("src/main/java/sk.jpg");
		byte[] b = new byte[f.available()];
		f.read(b);
		add.setImage(b);
		Session currentSession = session.openSession();
		Transaction beginTransaction = currentSession.beginTransaction();
		currentSession.save(st);
		currentSession.save(add);
		beginTransaction.commit();
		currentSession.close();
	}
}
