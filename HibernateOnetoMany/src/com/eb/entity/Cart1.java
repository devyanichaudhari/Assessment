package com.eb.entity;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//map cart1 class with table 
@Entity
@Table(name="CART")
public class Cart1 {
//@Id will add primary key for column
	@Id
	//it specify type of key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
   
	@Column(name="total")
	private double total;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="cart1")
	private Set<Items1>items1;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Items1> getItems1() {
		return items1;
	}

	public void setItems1(Set<Items1> items1) {
		this.items1 = items1;
	}

}