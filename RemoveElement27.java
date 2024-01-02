package com.Arrays;

public class RemoveElement27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        RemoveElement27 r=new RemoveElement27();
        System.out.println(r.removeElement(nums,val));
    }
    public int removeElement(int[] arr, int val) {
        int lastIndex=arr.length-1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                count++;
                int temp=arr[i];
                arr[i]=arr[lastIndex];
                arr[lastIndex]=temp;
                lastIndex--;
            }
        }
        return arr.length-count;
    }
}
