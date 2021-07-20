package com.codersdesks.basic;
/*
Given an array of integers nums and an integer target, return indices of the two numbers
 such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

EX: Input: nums = [3,2,4], target = 6
    Output: [1,2]
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumSolution1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j <= nums.length-1; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int [] {i,j};
                }
            }
        }

        return new int[2];
    }

    public static int[] twoSumSolution2(int[] nums, int target) {
        Map<Integer,Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(data.containsKey(target - nums[i]) && i != data.get(target - nums[i])) {
                return new int[]{i, data.get(target-nums[i])};
            }
            data.put(nums[i], i);
        }

        return new int[2];
    }


    public static void main(String[] args) {
        //int[] arr = {2, 7, 11, 15};
       // int target = 9;

       int[] arr = {3,2,4};
       int target = 6;

        //System.out.println(Arrays.toString(twoSumSolution1(arr, target)));

        System.out.println(Arrays.toString(twoSumSolution2(arr, target)));

    }
}
