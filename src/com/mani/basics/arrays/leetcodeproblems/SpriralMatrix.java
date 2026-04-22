package com.mani.basics.arrays.leetcodeproblems;
import java.util.Arrays;

public class SpriralMatrix {

    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[] array = spiralMatrix(matrix);
        // FIX: Use Arrays.toString to see the actual content
        System.out.println(Arrays.toString(array));
    }

    static int[] spiralMatrix(int[][] matrix) {
        if (matrix.length == 0) return new int[0];

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int[] array = new int[matrix.length * matrix[0].length];
        int index = 0;

        while(top <= bottom && left <= right){
            // 1. Move Right: Use <=
            for(int i = left; i <= right; i++){
                array[index++] = matrix[top][i];
            }
            top++;

            // 2. Move Down: Use <=
            for(int i = top; i <= bottom; i++){
                array[index++] = matrix[i][right];
            }
            right--;

            // 3. Move Left: Check boundary and use >=
            if (top <= bottom) {
                for(int i = right; i >= left; i--){
                    array[index++] = matrix[bottom][i];
                }
                bottom--;
            }

            // 4. Move Up: Check boundary and use >=
            if (left <= right) {
                for(int i = bottom; i >= top; i--){
                    array[index++] = matrix[i][left];
                }
                left++;
            }
        }
        return array;
    }
}
