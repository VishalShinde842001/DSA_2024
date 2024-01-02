package com.Arrays;

import java.util.Arrays;

public class HowManyNumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        HowManyNumbersSmallerThanCurrentNumber h = new HowManyNumbersSmallerThanCurrentNumber();
        System.out.println(Arrays.toString(h.smallerNumbersThanCurrent(nums)));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
}
