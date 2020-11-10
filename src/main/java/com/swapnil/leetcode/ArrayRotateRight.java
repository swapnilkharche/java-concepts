package com.swapnil.leetcode;

/*
 * @created 11/9/2020 - 7:47 PM
 * @author Swapnil Kharche
 */
public class ArrayRotateRight {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7};
        int k = 3; // number of rotations
        System.out.print("Original Array:: ");
        print(arr);
        rotateRight(arr,k);
    }

    private static void rotateRight(int[] arr, int k) {
        k = k % arr.length; // if k > arr.length then final number of rotations will be K% arr.length
        reverse(arr,0,arr.length -1); // reverse full array [7, 6, 5, 4, 3, 2, 1]
        reverse(arr,0,k-1); // reverse first half   [5, 6, 7, 4, 3, 2, 1]
        reverse(arr,k, arr.length -1 ); // reverse second half [5, 6, 7, 1, 2, 3, 4] = output
        System.out.print(System.lineSeparator() + "Array after "+ k + " rotations:: ");
        print(arr);
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    private static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
