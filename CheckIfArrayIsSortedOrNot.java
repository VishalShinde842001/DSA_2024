package com.Arrays;

public class CheckIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr={10};
        if(sortedOrNot(arr)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
    public static boolean sortedOrNot(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
