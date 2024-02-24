package com.edubridge.streamapi.comparable;
import java.util.*;
public class Executor {

	public static void main(String[] args) {
		ArrayList<Product>p1 = new ArrayList<Product>();
		p1.add(new Product("Speaker",3));
		p1.add(new Product("Keyboard",4));
		p1.add(new Product("Screen",5));
		p1.add(new Product("TV",4));
		Collections.sort(p1);
		
		System.out.println("Data after Sorting:");
		
		for(Product p:p1) {
			System.out.println(p.getRating()+" "+p.getPname());
		}
	}

}
