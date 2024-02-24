package com.edubridge.streamapi.comparator;
import java.util.*;
public class Executor {

	public static void main(String[] args) {
		ArrayList<Student1>a1 = new ArrayList<Student1>();
		a1.add(new Student1("Mumbai","Ameya",102));
		a1.add(new Student1("Pune","Shreya",101));
		a1.add(new Student1("Nashik","Sagar",104));
		a1.add(new Student1("Kolhapur","Yukta",105));
		System.out.println("Unsorted Data....");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		Collections.sort(a1, new SortbyRollNo());
		System.out.println("Sorted Data by Roll Number");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		Collections.sort(a1, new SortbyName());
		System.out.println("Sorted Data by Name");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
	}

}
