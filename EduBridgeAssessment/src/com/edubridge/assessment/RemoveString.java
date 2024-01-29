package com.edubridge.assessment;

import java.util.Scanner;

public class RemoveString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int i = 0;
		while (i < str.length()) {
			if (str.charAt(i) == 't') {
				i++;
		        if (i < str.length() && str.charAt(i) == 'h') 
		        {
		        	i++;
		        	if (i < str.length() && str.charAt(i) == 'e') 
		        	{
		        		i++;
		        		if (i < str.length() && str.charAt(i) == ' ') 
		        		{
		        			i++;
		        			}
		        		}
		        	} 
		        else 
		        {
		        	if (i > 0) 
		        	{
		        		--i;
		                System.out.print(str.charAt(i));
		                i++;
		                }
		        	if (i < str.length()) 
		        	{
		        		System.out.print(str.charAt(i));
		        		i++;
		        		}
		        	}
		        } 
			
			else 
			{
				System.out.print(str.charAt(i));
				i++;
				}
			}
		scanner.close();
	}

}
