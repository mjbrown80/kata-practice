package org.example;

import java.util.Arrays;

public class MakeMiddle {
//    Create a method called makeMiddle that takes in an integer array nums.
//    Return a new array length 2 containing the middle two elements from nums.
//    You can assume the length of nums is even and 2 or more.
//
//    For example:
//
//    makeMiddle({1, 2, 3, 4}) → {2, 3}
//    makeMiddle({7, 1, 2, 3, 4, 9}) → {2, 3}
//    makeMiddle({1, 2}) → {1, 2}

    public static void main(String[] args){
        int[] nums1 = {1, 2, 3, 4};
        int[] expected1 = {2, 3};
        int[] actual1 = makeMiddle(nums1);

        System.out.println("Test 1:");
        System.out.println("Input:    " + Arrays.toString(nums1));
        System.out.println("Expected: " + Arrays.toString(expected1));
        System.out.println("Actual:   " + Arrays.toString(actual1));
        System.out.println();

        // Test case 2
        int[] nums2 = {7, 1, 2, 3, 4, 9};
        int[] expected2 = {2, 3};
        int[] actual2 = makeMiddle(nums2);

        System.out.println("Test 2:");
        System.out.println("Input:    " + Arrays.toString(nums2));
        System.out.println("Expected: " + Arrays.toString(expected2));
        System.out.println("Actual:   " + Arrays.toString(actual2));
        System.out.println();

        // Test case 3
        int[] nums3 = {1, 2};
        int[] expected3 = {1, 2};
        int[] actual3 = makeMiddle(nums3);

        System.out.println("Test 3:");
        System.out.println("Input:    " + Arrays.toString(nums3));
        System.out.println("Expected: " + Arrays.toString(expected3));
        System.out.println("Actual:   " + Arrays.toString(actual3));
        System.out.println();
    }

    public static int[] makeMiddle(int[] nums){
        int[] result = new int[2];
        if (nums.length <= 2){
            return nums;
        }else{
            result[0] = nums[nums.length/2 -1];
            result[1] = nums[nums.length/ 2];
        }


        return result;
    }
}
