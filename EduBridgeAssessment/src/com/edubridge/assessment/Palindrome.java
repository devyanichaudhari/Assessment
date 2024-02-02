package com.edubridge.assessment;

import java.util.Scanner;

public class Palindrome {
	 public static String isPalindrome(String n)
	    {
		 String rev = "";
			String ans = "Not a Palindrome";
			for(int i=n.length()-1;i>=0;--i)                 
			{  
				rev = rev + n.charAt(i);
				if (n.equals(rev)) {
		            ans = "Palindrome";
		        }  
			}
			return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String n = s.nextLine();
		n = n.toLowerCase();
		String A = isPalindrome(n);
		System.out.println(A);
		
	}

}
