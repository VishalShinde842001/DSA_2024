package com.Arrays;

public class ShuffleTheArray_1470 {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};

        ShuffleTheArray_1470 s=new ShuffleTheArray_1470();
        for(int i:s.shuffle(arr,3)){
            System.out.print(i+" ");
        }
    }


    
    public int[] shuffle(int[] arr, int n) {
        int[] newArr = new int[2*n];
        int ptr1=0;
        int ptr2=n;

        for(int i=0;i<2*n;i++){
            if(i%2==0){
                newArr[i]=arr[ptr1++];
            }else{
                newArr[i]=arr[ptr2++];
            }
        }
        return newArr;
    }


}
