package com.hackerrank;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while( t --> 0){
            int data = sc.nextInt();
            isPrime(data, 2);
			/*
			 * boolean isPrime = true; for(int i =2; i < data ; i++) { if(data % i == 0) {
			 * System.out.println("Not prime"); isPrime = false; break; } } if(isPrime) {
			 * System.out.println("Prime");
			 * 
			 * }
			 */
        }
        
        sc.close();
	}
	
	static void isPrime(int n, int d) {
		if( n <= 2) {
			String msg = (n == 2 ? "Prime" : "Not prime");
			System.out.println(msg);
		}else {
				double sqrt =  Math.sqrt(n);
				
				if(isInt(sqrt)) {
					System.out.println("Not prime");
				}
				else if((n % 2) != 0 || (n % 3 != 0) || (n % 5 != 0 ) || (n % 7 != 0) && n > 10) {
					boolean prime = true;
					for(int count =11;  count < n /2; count++) {
						if(n % count ==0) {
							prime = false;
							break;
						}
					}
					if(prime)
						System.out.println("Prime");
					else
						System.out.println("Not prime");	
				}else {
					System.out.println("Prime");	
				}
			
		}
		
		
	}
	static boolean isInt(double d) {
		try {
			Integer.parseInt(""+d);
			return true;
		}catch (Exception e) {
		
		}
		return false;
	}
	
}
