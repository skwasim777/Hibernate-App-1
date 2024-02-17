package com.hiber;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "student_address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addId;
	@Column(length = 100)
	private String street;
	private String city;
	@Column(name = "is_open")
	private boolean isOpen;
	@Transient
	private double x;
	@Column(name = "added_date")
	@Temporal(TemporalType.DATE)
	private Date date;
	@Lob
	private byte[] image;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int addId, String street, String city, boolean isOpen, double x, Date date, byte[] image) {
		super();
		this.addId = addId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.date = date;
		this.image = image;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", x=" + x
				+ ", date=" + date + ", image=" + Arrays.toString(image) + "]";
	}

}
