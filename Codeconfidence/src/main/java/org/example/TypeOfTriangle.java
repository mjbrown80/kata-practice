package org.example;

public class TypeOfTriangle {
    //leetcode

//    You are given a 0-indexed integer array nums of size 3 which can form the sides of a triangle.
//    A triangle is called equilateral if it has all sides of equal length.
//    A triangle is called isosceles if it has exactly two sides of equal length.
//    A triangle is called scalene if all its sides are of different lengths.
//    Return a string representing the type of triangle that can be formed or "none" if it cannot form a triangle.
//
//            Example 1:
//    Input: nums = [3,3,3]
//    Output: "equilateral"
//    Explanation: Since all the sides are of equal length, therefore, it will form an equilateral triangle.

//            Example 2:
//    Input: nums = [3,4,5]
//    Output: "scalene"
//    Explanation:
//    nums[0] + nums[1] = 3 + 4 = 7, which is greater than nums[2] = 5.
//    nums[0] + nums[2] = 3 + 5 = 8, which is greater than nums[1] = 4.
//    nums[1] + nums[2] = 4 + 5 = 9, which is greater than nums[0] = 3.
//    Since the sum of the two sides is greater than the third side for all three cases, therefore, it can form a triangle.
//    As all the sides are of different lengths, it will form a scalene triangle.
//
//            Constraints:
//    nums.length == 3
//            1 <= nums[i] <= 100

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5};
        System.out.println("Test 1: Expected: scalene | Actual: " + triangleType(nums1));

        int[] nums2 = {3, 3, 3};
        System.out.println("Test 2: Expected: equilateral | Actual: " + triangleType(nums2));

        int[] nums3 = {4, 5, 4};
        System.out.println("Test 3: Expected: isosceles | Actual: " + triangleType(nums3));
    }

    public static String triangleType(int[] nums) {
        if (nums[0] == nums[1] && nums[0] == nums[2]) {
            return "equilateral";
        } else if (nums[0] != nums[1] && nums[0] != nums[2] && nums[1] != nums[2]) {
            return "scalene";
        } else {
            return "isosceles";

        }
    }
}
