package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraySumByIncrementingDuplicate {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1); // 1
		list.add(2); // 2
		list.add(2); // 3
		list.add(3); // 4
		list.add(3); // 5
		list.add(3); // 6
		list.add(4); // 7
		list.add(4); // 8
		list.add(5); // 9
		list.add(6); // 10
		list.add(9); // 11
		list.add(11);// 12
		
		Set<Integer> unique =  new HashSet<>(); 
		Collections.sort(list);
		int sum = 0;
		for(int i : list) {
			sum = findSum(unique, i,sum);
		}
		
		System.out.println("sum "+sum);
	}
	
	public static int findSum(Set<Integer> unique, int i,int sum) {
		
		if(unique.contains(i)){
			int next = i+1;
			sum = findSum(unique, next,sum);
		}else {
			unique.add(i);
			sum +=i;
		}		
		
		return sum;
	}
	
}