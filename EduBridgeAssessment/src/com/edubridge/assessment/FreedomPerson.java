package com.edubridge.assessment;

import java.util.Scanner;

public class FreedomPerson {


	// Returns position of survivor among
	// a circle of n persons and every
	// second person being killed
	static int FreePerson(int n)
	{

		// Find value of 2 ^ (1 + floor(Log n))
		// which is a power of 2 whose value
		// is just above n.
		int p = 1;
		while (p <= n)
			p *= 3;

		// Return 2n - 2^(1+floor(Logn)) + 1
		return (2 * n) - p + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of persons ");
		int n = s.nextInt();
		System.out.println("The chosen place is "
						+ FreePerson(n));
		s.close();
	}

}