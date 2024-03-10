package com.eb.pojo;

public class Orders 
{
 private int OrderId;
 private int totalbill;
public int getOrderId() {
	return OrderId;
}
public void setOrderId(int orderId) {
	OrderId = orderId;
}
public int getTotalbill() {
	return totalbill;
}
public void setTotalbill(int totalbill) {
	this.totalbill = totalbill;
}
public Orders() {
	super();
	// TODO Auto-generated constructor stub
}
public Orders(int totalbill) {
	super();
	this.totalbill = totalbill;
}
@Override
public String toString() {
	return "Orders [OrderId=" + OrderId + ", totalbill=" + totalbill + "]";
}
}