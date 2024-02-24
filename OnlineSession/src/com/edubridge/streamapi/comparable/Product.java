package com.edubridge.streamapi.comparable;

public class Product implements Comparable<Product>{
	private String pname;
	private int rating;
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.rating-o.rating;
	}
	public Product(String pname, int rating) {
		super();
		this.pname = pname;
		this.rating = rating;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
