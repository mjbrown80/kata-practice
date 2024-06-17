package org.example;

import java.util.Arrays;

public class RemoveElement {

//    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. T
//    he order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//    Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
//    The remaining elements of nums are not important as well as the size of nums.
//    Return k.
//    Custom Judge:
//
//    The judge will test your solution with the following code:
//    int[] nums = [...]; // Input array
//    int val = ...; // Value to remove
//    int[] expectedNums = [...]; // The expected answer with correct length.
//    // It is sorted with no values equaling val.
//
//    int k = removeElement(nums, val); // Calls your implementation
//
//assert k == expectedNums.length;
//    sort(nums, 0, k); // Sort the first k elements of nums
//for (int i = 0; i < actualLength; i++) {
//        assert nums[i] == expectedNums[i];
//    }
//    If all assertions pass, then your solution will be accepted.

//            Example 1:
//
//    Input: nums = [3,2,2,3], val = 3
//    Output: 2, nums = [2,2,_,_]
//    Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//    It does not matter what you leave beyond the returned k (hence they are underscores).
//    Example 2:
//
//    Input: nums = [0,1,2,2,3,0,4,2], val = 2
//    Output: 5, nums = [0,1,4,0,3,_,_,_]
//    Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//    Note that the five elements can be returned in any order.
//    It does not matter what you leave beyond the returned k (hence they are underscores).
//
//
//    Constraints:
//
//            0 <= nums.length <= 100
//            0 <= nums[i] <= 50
//            0 <= val <= 100
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int[] expectedNums1 = {2, 2};
        int expectedK1 = expectedNums1.length;
        int actualK1 = removeElement(nums1, val1);
        Arrays.sort(nums1, 0, actualK1);
        boolean test1Passed = Arrays.equals(Arrays.copyOfRange(nums1, 0, actualK1), expectedNums1);

        // Test Case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int[] expectedNums2 = {0, 1, 4, 0, 3};
        int expectedK2 = expectedNums2.length;
        int actualK2 = removeElement(nums2, val2);
        Arrays.sort(nums2, 0, actualK2);
        boolean test2Passed = Arrays.equals(Arrays.copyOfRange(nums2, 0, actualK2), expectedNums2);

        // Test Case 3
        int[] nums3 = {2, 2, 2, 2, 2};
        int val3 = 2;
        int[] expectedNums3 = {};
        int expectedK3 = expectedNums3.length;
        int actualK3 = removeElement(nums3, val3);
        Arrays.sort(nums3, 0, actualK3);
        boolean test3Passed = Arrays.equals(Arrays.copyOfRange(nums3, 0, actualK3), expectedNums3);

        // Test Case 4
        int[] nums4 = {1, 2, 3, 4, 5};
        int val4 = 6;
        int[] expectedNums4 = {1, 2, 3, 4, 5};
        int expectedK4 = expectedNums4.length;
        int actualK4 = removeElement(nums4, val4);
        Arrays.sort(nums4, 0, actualK4);
        boolean test4Passed = Arrays.equals(Arrays.copyOfRange(nums4, 0, actualK4), expectedNums4);

        // Test Case 5
        int[] nums5 = {};
        int val5 = 1;
        int[] expectedNums5 = {};
        int expectedK5 = expectedNums5.length;
        int actualK5 = removeElement(nums5, val5);
        Arrays.sort(nums5, 0, actualK5);
        boolean test5Passed = Arrays.equals(Arrays.copyOfRange(nums5, 0, actualK5), expectedNums5);

        // Print results
        printTestResult(nums1, val1, expectedK1, actualK1, expectedNums1, test1Passed);
        printTestResult(nums2, val2, expectedK2, actualK2, expectedNums2, test2Passed);
        printTestResult(nums3, val3, expectedK3, actualK3, expectedNums3, test3Passed);
        printTestResult(nums4, val4, expectedK4, actualK4, expectedNums4, test4Passed);
        printTestResult(nums5, val5, expectedK5, actualK5, expectedNums5, test5Passed);
    }
        private static void printTestResult(int[] nums, int val, int expectedK, int actualK, int[] expectedNums, boolean testPassed) {
            System.out.println("Input nums: " + Arrays.toString(nums));
            System.out.println("val: " + val);
            System.out.println("Expected k: " + expectedK);
            System.out.println("Actual k: " + actualK);
            System.out.println("Expected nums: " + Arrays.toString(expectedNums));
            System.out.println("Actual nums: " + Arrays.toString(Arrays.copyOfRange(nums, 0, actualK)));
            System.out.println("Test passed: " + testPassed + "\n");


    }

    public static int removeElement(int[] nums, int val){

        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[sum] = nums[i];
                sum++;
            }
        }
        return sum;
    }
}
