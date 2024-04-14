package com.project.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Menu_Info")
public class Menu 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	@Column(name="menu_name",length=255)
	private String menuName;
	@Column(name="price",length=255)
	private int price;
	@ManyToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name="Bill", referencedColumnName="total")
	private Order order;
	public Menu(String menuName, int price, Order order) {
		super();
		this.menuName = menuName;
		this.price = price;
		this.order = order;
	}
	@Override
	public String toString() {
		return "Menu [Id=" + Id + ", menuName=" + menuName + ", price=" + price + "]";
	}
	
}