package org.example;

public class FindTheNumberOfGoodPairs {

    // from leet code
//    You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively.
//    You are also given a positive integer k.
//    A pair (i, j) is called good
//    if nums1[i] is divisible by nums2[j] * k (0 <= i <= n - 1, 0 <= j <= m - 1).
//    Return the total number of good pairs.

    public static void main(String[] args) {
        int[] nums1_1 = {1,2,4,12};
        int[] nums2_1 = {2,4};
        int k1 = 3;

        System.out.println("Expected: 2  Actual: " + numberOfPairs(nums1_1, nums2_1, k1));

        int[] nums1_2 = {1,3,4};
        int[] nums2_2 = {1,3,4};
        int k2 = 1;

        System.out.println("Expected: 5 Actual: " + numberOfPairs(nums1_2, nums2_2, k2));
    }
    public static int numberOfPairs(int[] nums1, int[] nums2, int k){
        int sumOfGoodPairs = 0;

        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] % (nums2[j] * k) == 0){
                    sumOfGoodPairs += 1;
                }
            }
        }
        return sumOfGoodPairs;
    }
}
