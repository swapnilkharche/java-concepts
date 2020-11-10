package com.swapnil.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] array = {1,2,4,7,6,8};
        int sum = 6;
        int [] result = twoSum(array,sum);
        System.out.println("Result - ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    private static int[] twoSum(int[] array, int sum) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i],i );
        }
        for (int i = 0; i < array.length; i++) {
            int difference = sum - array[i];
            if(map.containsKey(difference)){
                int[] result = {map.get(difference),i};
                return result;
            }
        }
        int[] result = {-1,-1};

        return result;
    }
}
