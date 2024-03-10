package com.eb.pojo;

public class Customer 
{
	private int cusId;
	private String cusName;
	private String cusContact;
	private String cusAddress;
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusContact() {
		return cusContact;
	}
	public void setCusContact(String cusContact) {
		this.cusContact = cusContact;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cusName, String cusContact, String cusAddress) {
		super();
		this.cusName = cusName;
		this.cusContact = cusContact;
		this.cusAddress = cusAddress;
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusContact=" + cusContact + ", cusAddress="
				+ cusAddress + "]";
	}
	
}