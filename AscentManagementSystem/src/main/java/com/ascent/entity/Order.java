package com.ascent.entity;

import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Order_info")
@Data
@RequiredArgsConstructor
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="quantity")
	private int quantity;
	@Column(name="total")
	private int total;
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Menu> menu;
	@Override
	public String toString() {
		return "Order [id=" + id + ", quantity=" + quantity + ", total=" + total + ", menu=" + menu + "]";
	}
}
