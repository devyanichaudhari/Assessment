package com.edubridge.streamapi.intermediateoperators;
import java.util.*;
import java.util.stream.Collectors;
public class StudentExecutor {

	public static void main(String[] args) {
		List<Student>listofstudent = Arrays.asList(new Student("Devyani",24),
												 	new Student("Yukta",23),
													new Student("Sneha",26),
													new Student("preeti",24));
		List<String>studentname = listofstudent.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println("Student's Name: "+studentname);
		List<Integer>studentage = listofstudent.stream().map(x -> x.getAge()).collect(Collectors.toList());
		System.out.println("Student's Age: "+studentage);
	}
}
