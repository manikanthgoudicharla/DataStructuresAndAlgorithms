package com.mani.basics.searchingtechniques;

public class Binarysearch {
    public static void main(String[] args){

        System.out.println("Binary search");

        int output=binarySearch(new int[]{4,3,2,1},5);
        System.out.println("The Element Found At Index:"+output);


    }
    public static int binarySearch(int[] array,int key){
        int start=0;
        int end=array.length-1;
        int mid=-1;
        while(start<=end){
            mid=(start+end)/2;
            if(key==array[mid]){
                return mid;
            }
            else if(key>array[mid]){
                end=mid-1;
            }
            else if(key<array[mid]){
                start=mid+1;
            }

        }
        return -1;
    }


}
