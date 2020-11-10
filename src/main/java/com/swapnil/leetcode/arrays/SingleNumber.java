package com.swapnil.leetcode.arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * @created 11/9/2020 - 10:16 PM
 * @author Swapnil Kharche
 *  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
    Example 1:    Input: nums = [2,2,1]  Output: 1
    Example 2:    Input: nums = [4,1,2,1,2]  Output: 4
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,3,1};
        System.out.println(singNumber(arr));
        // solution with a linear runtime complexity and without using extra memory
        System.out.println(xorSingleNumber(arr));

    }
    //
    private static int xorSingleNumber(int[] arr) {
        int X = 0;
        for(int num : arr){
            X = X ^ num;
        }
        return X;
    }

    //Time complexity O(n) and SPace complecity O(n)
    private static int singNumber(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for(int a: arr){
            if(!set.add(a)) {
                set.remove(a);
            }
        }
        Iterator<Integer> iterator = set.iterator();

        return iterator.next();
    }
}
