package com.edubridge.streamapi.comparator;

public class Student1 {
	String name,address;
	int roll_no;
	public Student1(String address, String name, int roll_no) {
		super();
		this.name = name;
		this.address = address;
		this.roll_no = roll_no;
	}
	@Override
	public String toString() {
		return "Student1 [address=" + address + ", name=" + name + ", roll_no=" + roll_no + "]";
	}

}
