package com.mani.basics.searchingtechniques;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Linear Search:");
        int[][] arr={{124,156,199,202,212},{1,2,3,4,5},{24,27,19}};
        System.out.println("Enter the number to be searched:");
        int key=input.nextInt();
        int[] result=linearSearch(arr,key);

        if (Arrays.equals(result, new int[]{-1, -1})) {
            System.out.println("Element Not Found");
        }

        else{
            System.out.println("The element found at="+Arrays.toString(result));
        }

    }

    static int[] linearSearch(int[][] array,int key) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==key){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }


}