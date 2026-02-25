
//https://leetcode.com/problems/richest-customer-wealth/description/

package com.mani.basics.arrays.leetcodeproblems;

public class RichestCommonWealth4 {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        int wealth=highestWealth(array);
        System.out.println("highestWealth="+wealth);
    }

    static int highestWealth(int[][] array){
        int wealth=0;
        int highestwealth=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                wealth=wealth+array[i][j];
            }
            if(highestwealth<wealth){
                highestwealth=wealth;
            }
            wealth=0;
        }
        return highestwealth;
    }

}
