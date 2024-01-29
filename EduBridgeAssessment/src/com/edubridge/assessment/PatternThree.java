package com.edubridge.assessment;

import java.util.Scanner;

public class PatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j,k=1;
		System.out.print(k);
		for( i=1;i<=n;i++) //External for loop

		 {
		     for( j=1;j<=(n-i);j++) // internal for loop

		     {
		         k=k+2; // operation for series.
		         System.out.print(k); // print the series

		     }
		     System.out.println(""); // line change
		 }
		
	}

}
