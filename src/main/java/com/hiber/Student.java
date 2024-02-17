package com.hiber;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	private int id;
	private String name;
	private String clgName;
	private String city;
	@Embedded
	private Certificate certificate;

	public Student(int id, String name, String clgName, String city) {
		super();
		this.id = id;
		this.name = name;
		this.clgName = clgName;
		this.city = city;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clgName=" + clgName + ", city=" + city + ", certificate="
				+ certificate + "]";
	}

}
