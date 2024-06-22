package org.example;

public class StrictlyIncreasing {
//    Create a method called isStrictlyIncreasing that takes in an integer array called nums.
//    Return true if the values in the array are strictly increasing.
//    Return false otherwise.
//
//    For example:
//
//    isStrictlyIncreasing({5,7,8,10}) → true
//    isStrictlyIncreasing({5,7,7,10}) → false
//    isStrictlyIncreasing({-5,-3,0,17}) → true

    public static void main(String[] args){
    boolean result1 = isStrictlyIncreasing(new int[]{5, 7, 8, 10});
        System.out.println("Test Case 1: Expected true, Actual " + result1);

    boolean result2 = isStrictlyIncreasing(new int[]{5, 7, 7, 10});
        System.out.println("Test Case 2: Expected false, Actual " + result2);

    boolean result3 = isStrictlyIncreasing(new int[]{-5, -3, 0, 17});
        System.out.println("Test Case 3: Expected true, Actual " + result3);

    boolean result4 = isStrictlyIncreasing(new int[]{1, 2, 3, 2});
        System.out.println("Test Case 4: Expected false, Actual " + result4);

    boolean result5 = isStrictlyIncreasing(new int[]{1});
        System.out.println("Test Case 5: Expected true, Actual " + result5);

    boolean result6 = isStrictlyIncreasing(new int[]{});
        System.out.println("Test Case 6: Expected true, Actual " + result6);

    boolean result7 = isStrictlyIncreasing(new int[]{2, 2, 2, 2});
        System.out.println("Test Case 7: Expected false, Actual " + result7);
    }

    public static boolean isStrictlyIncreasing(int[] nums){
        if(nums.length == 0){
            return true;
        }
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] >= nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
