package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hiber.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        try (Session session = factory.openSession()) {
            Transaction tr = session.beginTransaction();

			/*
			 * Questions q1 = new Questions(); q1.setQuestionId(101);
			 * q1.setQuestion("what is java?");
			 * 
			 * Answer ans1 = new Answer(); ans1.setAnswerId(110);
			 * ans1.setAnswer("java is programing language."); ans1.setQuestions(q1);
			 * 
			 * Answer ans2 = new Answer(); ans2.setAnswerId(111);
			 * ans2.setAnswer("java is OOPs programming language."); ans2.setQuestions(q1);
			 * 
			 * Answer ans3 = new Answer(); ans3.setAnswerId(112);
			 * ans3.setAnswer("java is use to create web application.");
			 * ans3.setQuestions(q1);
			 * 
			 * List<Answer> list = new ArrayList<>(); list.add(ans1); list.add(ans2);
			 * list.add(ans3); q1.setAnswers(list);
			 * 
			 * session.save(q1); session.save(ans1); session.save(ans2); session.save(ans3);
			 */
            Questions q = session.get(Questions.class,101);
            System.out.println(q.getQuestionId());
            System.out.println(q.getQuestion());
//            System.out.println(q.getAnswers().size());
//            for(Answer a : q.getAnswers()) {
//            	System.out.println(a.getAnswer());
//            }
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}
