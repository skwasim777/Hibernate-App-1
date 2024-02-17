package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hiber.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.seteId(101);
		e1.setName("wasim");
		e2.seteId(102);
		e2.setName("salman");
		Project p1 = new Project();
		Project p2 = new Project();
		p1.setpId(111);
		p1.setProjectName("library management system.");
		p2.setpId(112);
		p2.setProjectName("blog application");
		List<Employee> list1 = new ArrayList<>();
		List<Project> list2 = new ArrayList<>();

		list1.add(e1);
		list1.add(e2);
		list2.add(p1);
		list2.add(p2);

		e1.setProjects(list2);
		p1.setEmps(list1);
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		ts.commit();
		factory.close();
	}
}
