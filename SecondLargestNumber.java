package com.Arrays;


import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,34,3,4,3,2,3,4,5,4,5,6,6,7,7,7};
        System.out.println(bruteForceSolution(arr));
        System.out.println(betterSolution(arr));
        System.out.println(optimalSolution(arr));

    }
   /* public static int bruteForceSolution(int[] arr){
        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=arr[i-1]){
                return arr[i-1];
            }
        }
        return -1;
    }*/
    //This is same as that of above but this are not optimal solutions its takes
    //in worst case NlogN+N
    public static int bruteForceSolution(int[] arr){
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largest){
                return arr[i];
            }
        }
        return -1;
    }

    //This will take N+N time complexity(This is not best approch
    public static int betterSolution(int[] arr){
        //find max first
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        //Find second max
        int secMax=Integer.MIN_VALUE;
        for(int i:arr){
            if(i<max&&i>secMax){
                secMax=i;
            }
        }
        return secMax;
    }
    public static int optimalSolution(int[] arr){
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            if(arr[i]<max&&arr[i]>secMax){
                secMax=arr[i];
            }
        }
        return secMax;
    }
}
