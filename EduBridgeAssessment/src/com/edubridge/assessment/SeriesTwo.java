package com.edubridge.assessment;

import java.util.Scanner;

public class SeriesTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int a = 6;
		int b =5;
		//int res;
		System.out.print(a+" ");
		for(i=1;i<=n;i++)
		{
			a=a+b*i;
			System.out.print(a+" ");
		}
	}

}