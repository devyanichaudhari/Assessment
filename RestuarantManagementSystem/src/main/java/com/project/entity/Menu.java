package com.project.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu 
{
	private int menuId;
	private String menuName;
	private int price;
	@ManyToOne
	@JoinColumns({@JoinColumn(name="Order_Id", referencedColumnName="OrderId"),
	@JoinColumn(name="Total_Bill", referencedColumnName="totalbill")})
	private Order order;
}
