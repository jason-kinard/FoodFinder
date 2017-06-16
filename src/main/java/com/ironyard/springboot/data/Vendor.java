package com.ironyard.springboot.data;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vendor {
	
	private String name;
	private String description;
	private float costPerPerson;
	private int rating;
	
    @Id 
    @GeneratedValue
	private long id;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getCostPerPerson() {
		return costPerPerson;
	}
	public void setCostPerPerson(float costPerPerson) {
		this.costPerPerson = costPerPerson;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
