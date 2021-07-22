package com.codersdesks.basic;
/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes
 the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321

 */
public class ReverseInteger {
    public static void main(String[] args) {
      int rev =   new ReverseInteger().reverse(1534236469);
      System.out.println(rev);
    }

    int rev = 0, preRev = 0;
    public int reverse(int x) {

        if(x == 0) return rev;

        while(x  !=0 ){
            int rem = x % 10;
            rev = rev* 10 + rem;
            if((rev - rem) / 10  !=  preRev){
                return 0;
            }
            preRev = rev;
            x = x /10;
        }
        return rev;
    }
}
