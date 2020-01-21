package com.hackerrank;

import java.util.Scanner;

public class BitwiseTest {

	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int t = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int tItr = 0; tItr < t; tItr++) {
	            String[] nk = scanner.nextLine().split(" ");

	            int n = Integer.parseInt(nk[0]);

	            int k = Integer.parseInt(nk[1]);
	            
	            for(int i =0; i <= n; i++) {
	            	int temp = i+1;
	            	
	            }
	        }

	        scanner.close();
	    }
}
