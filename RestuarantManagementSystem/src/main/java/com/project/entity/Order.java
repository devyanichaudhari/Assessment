package com.project.entity;

import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

public class Order 
{
	private int OrderId;
	private int totalbill;
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Menu> menus;
}
