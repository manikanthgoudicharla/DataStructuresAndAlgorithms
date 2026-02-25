
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package com.mani.basics.arrays.leetcodeproblems;

public class Evennoofdigits3 {
    class Solution {
        public int findNumbers(int[] nums) {
            int evendigitsnums=0;
            for(int arr:nums){
                if(String.valueOf(Math.abs(arr)).length()%2==0){
                    evendigitsnums=evendigitsnums+1;
                }
            }
            return evendigitsnums;
        }
    }
}
