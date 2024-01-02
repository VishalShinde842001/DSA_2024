package com.Arrays;

import java.util.Arrays;
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
public class MissingNumber {


    public static void main(String[] args) {
        int[] arr={0,1,3,4};
        MissingNumber m=new MissingNumber();
        System.out.println(m.missingNumber1(arr));
        System.out.println(m.missingNumber2(arr));
        System.out.println(m.missingNumber3(arr));
        System.out.println(m.missingNumber4(arr));


    }


    //This is first Approch to solve this problem
    public int missingNumber1(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum=sum-nums[i];
        }
        return sum;
    }
    //This is second approch to solve this problems
    public int missingNumber2(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
    public int missingNumber3(int[] arr) {
        int n = arr.length;
        boolean[] bool = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            int a = arr[i];
            if (a >= 0 && a <= n) {
                bool[a] = true;
            }
        }

        for (int i = 0; i < bool.length; i++) {
            if (!bool[i]) {
                return i;
            }
        }

        return -1;
    }
    public int missingNumber4(int[] nums) {
        int n = nums.length;

        // Initialize the result with the size of the array
        int result = n;

        // XOR all the indices and values
        for (int i = 0; i < n; i++) {
            result ^= i ^ nums[i];
        }

        return result;
    }


}
