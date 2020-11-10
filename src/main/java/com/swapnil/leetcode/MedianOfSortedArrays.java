package com.swapnil.leetcode;

/*
 * @created 11/4/2020 - 11:15 PM
 * @author Swapnil Kharche
 */
public class MedianOfSortedArrays {

    public static void main(String[] args) {
        int[] a = new int[]{1,2};
        int[] b = new int[]{3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }

    private static double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] arr = new int[num1.length+num2.length];
        int i=0,j=0;
        while(i < num1.length && j < num2.length){
            if(num1[num1.length-1] < num2[0]){
                arr[i] = num1[i];
                i++;
                

            }
        }
        return 0.0;
    }
}
