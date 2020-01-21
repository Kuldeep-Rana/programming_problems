package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BookFine {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String actual = scanner.nextLine(); 
		String expected = scanner.nextLine();
		
		String [] actualDateArr = actual.split(" ");
		String [] expectedDateArr = expected.split(" ");
		
		int actualYear = Integer.valueOf(actualDateArr[2]);
		int expectedYear = Integer.valueOf(expectedDateArr[2]);
		
		int actualMonth = Integer.valueOf(actualDateArr[1]);
		int expectedMonth = Integer.valueOf(expectedDateArr[1]);
		
		int actualDay = Integer.valueOf(actualDateArr[0]);
		int expectedDay = Integer.valueOf(expectedDateArr[0]);
		
		if(expectedYear > actualYear) {
			expectedMonth = Integer.valueOf(expectedDateArr[1])+12;
		}
		
		
		if(expectedMonth > actualMonth) {
			expectedDay = Integer.valueOf(expectedDateArr[0])+30;
		}
		
		if(actualYear > expectedYear) {
			System.out.println(10000);
		}
		else if(actualMonth > expectedMonth) {
			int late = actualMonth - expectedMonth;
            System.out.println(500 * late);
		}else if(actualDay > expectedDay) {
			int late = actualDay - expectedDay;
            System.out.println(15 * late);
		}
		else {
			System.out.println(0);
		}
		
		scanner.close();
		
	}
}
