package com.edubridge.assessment;

import java.util.Scanner;

public class SeriesFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] a = new float[n];
        a[0] = 0.5f;
        int j = 1;
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + j;
            j *= 3;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        scanner.close();
	}

}
