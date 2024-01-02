package com.Arrays;

import java.util.HashMap;

/*
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

        For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

        Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
*/
//Date:2/1/24
public class NextGreaterElement1_496_leetcode {
    public static void main(String[] args) {
        int[] arr1 = {4, 1, 2};
        int[] arr2 = {1, 3, 4, 2};
        NextGreaterElement1_496_leetcode n = new NextGreaterElement1_496_leetcode();
        for (int i : n.nextGreaterElement(arr1, arr2)) {
            System.out.print(i + " ");
        }
    }

    //Actually it is acceptable but not beating others
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums2.length; i++) {
            boolean condition = false;  // Reset the condition flag for each iteration
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[i] < nums2[j]) {
                    System.out.println(nums2[i] + " " + nums2[j]);
                    condition = true;
                    map.put(nums2[i], nums2[j]);
                    break;
                }
            }
            if (!condition) {
                map.put(nums2[i], -1);
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}
