package com.edubridge.assessment;

import java.util.Scanner;

public class FeeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String studentType = s.next();
		s.nextLine();
		int tutionfee = s.nextInt();
		int busfee = s.nextInt();
		int hostelfee = s.nextInt();
		double totalfee;
		switch(studentType)
		{
		case "MSDS":
			totalfee = tutionfee + busfee;
			System.out.printf("%.2f",totalfee);
			break;
		case "MSH":
			totalfee = tutionfee + hostelfee;
			System.out.printf("%.2f",totalfee);
			break;
		case "MGSDS":
			totalfee = 1.50*tutionfee + busfee;
			System.out.printf("%.2f",totalfee);
			break;
		case "MGSH":
			totalfee = 1.50*tutionfee + hostelfee;
			System.out.printf("%.2f",totalfee);
			break;
		default:
			System.out.println("Invalid");
		}
	}

}