package com.swapnil.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * @created 11/9/2020 - 9:59 PM
 * @author Swapnil Kharche
 *
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct

   * Input: [1,2,3,1]
   Output: true

   * Input: [1,2,3,4]
   Output: false
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    private static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i < nums.length; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
