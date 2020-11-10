package com.swapnil.leetcode;

/*
 * @created 11/2/2020 - 3:30 PM
 * @author Swapnil Kharche
 *
 * Find the max sum subarray of a fixed size k
 * Example input = [4,2,1,7,8,1,2,8,1,0]
 *
 */
public class MaxSumSubarray {

    public static void main(String[] args) {
        System.out.println(findMaxSumSubarray(3,new int[]{4,2,1,7,8,1,2,8,1,0}));
    }
    //using sliding window algorithm
    private static int findMaxSumSubarray(int k, int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum =0;
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            if(i >= k - 1){
                maxSum = Math.max(maxSum,currentSum);
                currentSum -= arr[i-(k-1)];
            }
        }
        return maxSum;
    }
}
