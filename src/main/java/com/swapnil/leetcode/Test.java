package com.swapnil.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * @created 11/2/2020 - 6:49 PM
 * @author Swapnil Kharche
 */

public class Test {

    public static void main(String[] args) {
        //System.out.println(maxSubarraySum(3,new int[] {4,9,2,2,5,1,6}));

//        System.out.println(maxLengthDistinctChar(3,"ijkj"));

        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    private static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int start=0,end=0;
        int max =0 ;
        Set<Character> set = new HashSet<>();
        while(start < length &&  end < length){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end ++;
                max = Math.max(max, end - start);
            }else{
                set.remove(s.charAt(start));
                start++;
            }

        }
        return max;
    }

    private static int maxLengthDistinctChar(int k, String input) {
        int maxSubLength = 0;
        int startWindow =0;
        int endWindow =0;
        int len =0 ;

        HashMap<Character,Integer> bucket = new HashMap<>();
        for(int i=0; i< input.length();i++){
            bucket.merge(input.charAt(endWindow),1,Integer::sum);
//            len++;
            endWindow++;
            len = endWindow - startWindow -1;
            while(bucket.size() > k){
                maxSubLength = Math.max(len,maxSubLength);
                int count = bucket.get(input.charAt(startWindow));
                bucket.put(input.charAt(startWindow),--count);
                if(count==0){
                    bucket.remove(input.charAt(startWindow));
                }
                startWindow++;
            }

        }
        
        return maxSubLength;
    }


    private static int maxSubarraySum(int k, int[] arr) {
        int maxSum =0;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            if(i >= k -1 ){
                maxSum = Math.max(sum,maxSum);
                sum -= arr[i - (k -1)];
            }

        }
        return maxSum;
    }
}
