package com.edubridge.assessment;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String n = s.nextLine();
		for(int i=n.length();i>0;--i)                 
		{  
			char a = n.charAt(i-1);
			System.out.print(a);              
		}  
	}

}
