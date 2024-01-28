package com.edubridge.assessment;

import java.util.Scanner;

public class FloatingPointWithPrecisions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float testfloat = scan.nextFloat();
		System.out.println(String.format("%.2f", testfloat));
		scan.close();
	}

}
