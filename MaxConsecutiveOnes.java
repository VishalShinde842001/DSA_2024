package com.Arrays;

import java.util.Stack;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        MaxConsecutiveOnes m=new MaxConsecutiveOnes();
        System.out.println(m.findMaxConsecutiveOnes(nums));
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i:nums){
            if(i==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        return max;
    }



    //This is not time and space efficient
    public int findMaxConsecutiveOnes1(int[] nums) {
        Stack<Integer> stack=new Stack<Integer>();
        for(int i:nums){
            stack.push(i);
        }
        int count=0;
        int max=0;
        while(!stack.isEmpty()){
            int a=stack.peek();
            if(a==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
            stack.pop();
        }
        return max;
    }

}
