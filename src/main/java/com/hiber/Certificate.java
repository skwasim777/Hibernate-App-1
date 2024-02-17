package com.hiber;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String course;
	private int duaration;

	public Certificate() {
		// TODO Auto-generated constructor stub
	}

	public Certificate(String course, int duaration) {
		super();
		this.course = course;
		this.duaration = duaration;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getDuaration() {
		return duaration;
	}

	public void setDuaration(int duaration) {
		this.duaration = duaration;
	}

}
