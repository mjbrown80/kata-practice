package org.example;

public class MoreOneFour {
//    Create a method called more14 that takes in an array of integers called nums.
//    Return true if the number of 1s in nums is greater than the number of 4s in nums.
//    Otherwise return false.
//
//    For example:
//
//    more14({1, 4, 1}) → true
//    more14({1, 4, 1, 4}) → false
//    more14({1, 1}) → true

    public static void main(String[] args){
        int[] testArray1 = {1, 4, 1};
        System.out.println("Test Case 1: Expected true, Actual " + more14(testArray1));

        int[] testArray2 = {1, 4, 1, 4};
        System.out.println("Test Case 2: Expected false, Actual " + more14(testArray2));

        int[] testArray3 = {1, 1};
        System.out.println("Test Case 3: Expected true, Actual " + more14(testArray3));

        int[] testArray4 = {4, 4, 4, 1};
        System.out.println("Test Case 4: Expected false, Actual " + more14(testArray4));

        int[] testArray5 = {1, 1, 4, 4, 1};
        System.out.println("Test Case 5: Expected true, Actual " + more14(testArray5));

        int[] testArray6 = {1, 4};
        System.out.println("Test Case 6: Expected false, Actual " + more14(testArray6));

        int[] testArray7 = {};
        System.out.println("Test Case 7: Expected false, Actual " + more14(testArray7));

        int[] testArray8 = {1};
        System.out.println("Test Case 8: Expected true, Actual " + more14(testArray8));

        int[] testArray9 = {4};
        System.out.println("Test Case 9: Expected false, Actual " + more14(testArray9));
    }

    public static boolean more14(int[] nums){
        int fours = 0;
        int ones = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] ==4){
                fours++;
            }if (nums[i] == 1){
                ones++;
            }
        }
        if (ones > fours){
            return true;
        }
        return false;
    }
}
