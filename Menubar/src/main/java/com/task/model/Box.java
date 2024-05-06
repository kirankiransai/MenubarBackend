package com.task.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table
public class Box {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String country;
	private double sales;
	private double changes;
	@Lob
	
	private byte[] image;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public double getSales() {
		return sales;
	}



	public void setSales(double sales) {
		this.sales = sales;
	}



	public double getChanges() {
		return changes;
	}



	public void setChanges(double changes) {
		this.changes = changes;
	}



	public byte[] getImage() {
		return image;
	}



	public void setImage(byte[] image) {
		this.image = image;
	}



	public Box(int id, String country, double sales, double changes, byte[] image) {
		super();
		this.id = id;
		this.country = country;
		this.sales = sales;
		this.changes = changes;
		this.image = image;
	}



	public Box() {
		super();
	}
	
	
	
	
	
	
	
	

}
