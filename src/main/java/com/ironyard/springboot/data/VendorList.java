package com.ironyard.springboot.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class VendorList {
	@OneToMany(cascade=CascadeType.ALL)
	public List<Vendor> vendors;
	@Id
	@GeneratedValue
	public long id;
	
	
	
	public List<Vendor> getVendors() {
		return vendors;
	}
	public void setUsers(List<Vendor> vendors) {
		this.vendors = vendors;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}


