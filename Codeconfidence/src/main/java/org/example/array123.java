package org.example;

public class array123 {

    /*
Exercise 24: array123
Create a boolean method called array123 that takes in an integer array “nums”.
Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere in order.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 3]) → false
array123([1, 1, 2, 1, 2, 3]) → true
kata
*/
    public static void main(String[] args) {

        int[] nums = {3, 1, 4, 1, 3, 9, 2, 6};

        boolean result = array123(nums);

        System.out.println("Expected: false - Actual: " + result);
        System.out.println("Expected: true - Actual: " + array123(new int[]{1, 1, 2, 3, 4, 5}));
        System.out.println("Expected: true - Actual: " + array123(new int[]{5, 4, 1, 2, 3, 2, 3}));
    }

    public static boolean array123(int[] nums) {

//        for (int i = 0; i < nums.length-2; i++){
//            for (int j = 1; j < nums.length-1; j++){
//                for (int k = 2; k < nums.length; k++){
//                    if (nums[i] == 1 && nums[j] == 2 && nums[k] ==3){
//                        return true;
//                    }
//                }
//            }
//        }
        for (int i = 0; i < nums.length -2; i++){
            if (nums[i] == 1 && nums[i + 1] ==2 && nums[i + 2] == 3){
                return true;
            }
        }

        return false;
    }
}



