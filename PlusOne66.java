package com.Arrays;
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

import java.sql.Array;

//        Increment the large integer by one and return the resulting array of digits.
public class PlusOne66 {
    //this is leetcode problems
    public static void main(String[] args) {
        int[] arr={8,8,9};
        PlusOne66 p=new PlusOne66();

        for(int i:p.plusOne(arr)){
            System.out.print(i+ " ");
        }

    }

    //Ok but not in good time complexity
    public int[] plusOne(int[] arr) {
        int n=arr.length;
        if(arr[n-1]<9){
            arr[n-1]=arr[n-1]+1;
            return arr;
        }

        boolean cond=true;
        for(int i=n-1;i>=0;i--){
            if(arr[i]==9){
                arr[i]=0;
            }else{
                cond=false;
                arr[i]=arr[i]+1;
                break;
            }
        }
        boolean  c=cond;
        System.out.println(cond);
        if(!cond){
            return arr;
        }
        int[] ar=new int[n+1];
        ar[0]=1;
        return ar;
    }

}
