package com.Arrays;

import java.util.HashMap;

/*You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]*/
public class Set_Mismatch_645_leetcode {
    public static void main(String[] args) {

        int[] nums = {1, 1};
        Set_Mismatch_645_leetcode s = new Set_Mismatch_645_leetcode();
        for (int i : s.findErrorNums(nums)) {
            System.out.print(i + " ");
        }
    }
    //Good but not beating others try with another idea also
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] returnArr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                returnArr[0]=i;
                map.put(i,map.get(i)+1);

            }else{
                map.put(i,1);
            }
        }
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                returnArr[1]=i;
                break;
            }
        }
        return returnArr;
    }

}
