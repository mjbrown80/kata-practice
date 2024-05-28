package org.example;

import java.util.HashMap;
import java.util.Map;

public class duplicateNumbersXOR {
// leet code
//    You are given an array nums, where each number in the array appears either once or twice.
//    Return the bitwise XOR of all the numbers that appear twice in the array,
//    or 0 if no number appears twice.

//    Example 1:
//    Input: nums = [1,2,1,3]
//    Output: 1
//    Explanation:
//    The only number that appears twice in nums is 1.
//
//    Example 2:
//    Input: nums = [1,2,3]
//    Output: 0
//    Explanation:
//    No number appears twice in nums.

//    Example 3:
//    Input: nums = [1,2,2,1]
//    Output: 3
//    Explanation:
//    Numbers 1 and 2 appeared twice. 1 XOR 2 == 3.

    public static void main(String[] args) {
        // Test cases
        System.out.println("Expected: 1, Actual: " + duplicateNumbersXOR(new int[]{1, 2, 1, 3}));
        System.out.println("Expected: 0, Actual: " + duplicateNumbersXOR(new int[]{1, 2, 3}));
        System.out.println("Expected: 3, Actual: " + duplicateNumbersXOR(new int[]{1, 2, 2, 1}));
        System.out.println("Expected: 3, Actual: " + duplicateNumbersXOR(new int[]{4, 5, 4, 6, 7, 7}));
        System.out.println("Expected: 0, Actual: " + duplicateNumbersXOR(new int[]{10, 10, 20, 20, 30, 30, 40}));
        System.out.println("Expected: 4, Actual: " + duplicateNumbersXOR(new int[]{1, 1, 2, 3, 3, 2, 4, 4, 5}));
        System.out.println("Expected: 1, Actual: " + duplicateNumbersXOR(new int[]{2, 3, 5, 2, 6, 3, 7, 8}));
    }

    public static int duplicateNumbersXOR(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 2) {
                result ^= entry.getKey();
            }
        }
        return result;
    }
}
