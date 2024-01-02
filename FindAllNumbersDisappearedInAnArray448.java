package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray448 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        FindAllNumbersDisappearedInAnArray448 f = new FindAllNumbersDisappearedInAnArray448();
        for (Integer i : f.findDisappearedNumbers(arr)) {
            System.out.print(i + " ");
        }
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<Integer>();
        boolean[] bool = new boolean[nums.length + 1]; // Fix: Increase the size by 1

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            bool[a] = true;
        }

        for (int i = 1; i < bool.length; i++) { // Fix: Start from index 1
            if (!bool[i]) {
                arr.add(i);
            }
        }

        return arr;
    }
}
