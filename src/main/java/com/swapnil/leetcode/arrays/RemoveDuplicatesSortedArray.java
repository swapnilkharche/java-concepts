package com.swapnil.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * @created 11/9/2020 - 8:43 AM
 * @author Swapnil Kharche
 *
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

   Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2};
        int len = removeDuplicates(nums);
        System.out.println("Lemgth:: " + len);
        System.out.print("Array with unique elements:: ");
        for(int i=0; i < len;i++){
            System.out.print(nums[i] +" ");
        }

    }
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int j=0;
        for(int i=0; i < nums.length; i++){

            if(set.add(nums[i])){
                nums[j++] = nums[i];
//                j++;
            }
        }
        return j;
    }
}
