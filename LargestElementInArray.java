package com.Arrays;

import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr={23,34,56,4,32,2,4,5};
        System.out.println(bruteForceSolution(arr));
        System.out.println(optimalSolution(arr));
    }
    public static int bruteForceSolution(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int optimalSolution(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}
