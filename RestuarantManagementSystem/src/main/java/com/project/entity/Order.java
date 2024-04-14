package com.project.entity;
import java.util.Set;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="Order_Info")
public class Order 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	@Column(name="total",length=255)
	private int totalbill;
	@Column(name="quantity")
	private int quantity;
	@OneToMany(fetch = FetchType.LAZY,mappedBy ="order",cascade=CascadeType.ALL)
	private Set<Menu> menu;
	
	@Override
	public String toString() {
		return "Order [Id=" + Id + ", totalbill=" + totalbill + ", menus=" + menu + "]";
	}

	public Order(int totalbill, int quantity) {
		super();
		this.totalbill = totalbill;
		this.quantity = quantity;
	}
}
