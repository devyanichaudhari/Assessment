package com.project.entity;

import jakarta.persistence.JoinColumn;
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
	@JoinColumn(name="order_id",nullable=false)
	private Order order;
}
