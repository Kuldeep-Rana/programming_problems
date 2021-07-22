package com.codersdesks.basic;

import java.util.HashMap;
import java.util.Map;

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3
Example 2:

Input: s = "IV"
Output: 4
 */

public class RomanToNumber {
    public static void main(String[] args) {
        int out = new RomanToNumber().romanToInt("XC");
        System.out.println(out);
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int value =0;
        int result=0;
        for(char c : s.toCharArray()){
            if(value == 1 && ( c == 'V' || c == 'X')){
                result = result - value;
                value = map.get(c) - value;
            }
            else if(value == 10 && ( c == 'L' || c == 'C')){
                result = result - value;
                value = map.get(c) - value;
            }
            else if(value == 100 && ( c == 'D' || c == 'M')){
                result = result - value;
                value = map.get(c) - value;
            }
            else{
                value = map.get(c);
            }
            result +=value;
        }
        return result;
    }
}
