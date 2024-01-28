package com.edubridge.assessment;

import java.util.Scanner;

public class SearchNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int x =s.nextInt(); 
		int arr[] = new int[x];
		//int b =arr[0];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0;i<x;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Enter the Element you want to search: ");
		int a = s.nextInt();
		for(int i=0;i<x;i++)
		{
			if(a==arr[i])
			{
				a=arr[i];
				System.out.println(a+" is present in the Array");
			}
		}	
		//System.out.println(a+" is not present in the Array");
	}

}
