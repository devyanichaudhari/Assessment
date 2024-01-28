package com.edubridge.assessment;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=1,row=3;
		for(i=0;i<=row;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}

}
