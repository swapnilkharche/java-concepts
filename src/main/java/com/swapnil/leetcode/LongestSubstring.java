package com.swapnil.leetcode;

/*
 * @created 11/1/2020 - 3:59 PM
 * @author Swapnil Kharche
 */

/* Given a string s, find the length of the longest substring without repeating characters.
*  Input: s = "pwwkew"
*  Output: 3
*  Explanation: The answer is "wke", with the length of 3.
*  Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*
*/

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        //corner case : " " should return 1, as space is character
        String s = "dvdf";
        int longestSubLength = lenghOfLongestSubstring_SlidingWindowAlgo(s);//lengthOfLongestSubstring(s);
        System.out.println(longestSubLength);
    }

    private static int lenghOfLongestSubstring_SlidingWindowAlgo(String s) {

        return 0;
    }

    private static int lengthOfLongestSubstring(String s) {
        char[] chArray = s.toCharArray();
        int len =0,longestLen =0;
        Set<Character> set = new HashSet<Character>();
        for(char ch : chArray){
            if(set.add(ch)!=false) {
                len++;
            }else{
                if(longestLen<len)
                    longestLen=len;
                len =1;
            }
        }
        if(len>longestLen) longestLen = len;
        return longestLen;
    }



}
