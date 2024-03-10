package com.eb.pojo;

public class Employee 
{
	private int Eid;
	private String Ename;
	private String Edesignation;
	private String Econtact;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEdesignation() {
		return Edesignation;
	}
	public void setEdesignation(String edesignation) {
		Edesignation = edesignation;
	}
	public String getEcontact() {
		return Econtact;
	}
	public void setEcontact(String econtact) {
		Econtact = econtact;
	}
	public Employee(String ename, String edesignation, String econtact) {
		super();
		Ename = ename;
		Edesignation = edesignation;
		Econtact = econtact;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Edesignation=" + Edesignation + ", Econtact=" + Econtact
				+ "]";
	}
}