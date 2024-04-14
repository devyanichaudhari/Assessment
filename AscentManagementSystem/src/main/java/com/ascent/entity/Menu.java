package com.ascent.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="menu_info")
@NoArgsConstructor
public class Menu {
	public Menu(String menuName, int price) {
		super();
		this.menuName = menuName;
		this.price = price;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="menu_Name")
	private String menuName;
	@Column(name="menu_Price")
	private int price;
	@ManyToOne()
	@JoinColumns({@JoinColumn(name="Quantity",referencedColumnName="quantity"),
			@JoinColumn(name="Total",referencedColumnName="total")})
	private Order order;
	@Override
	public String toString() {
		return "Menu [id=" + id + ", menuName=" + menuName + ", price=" + price + "]";
	}
	
	
}
