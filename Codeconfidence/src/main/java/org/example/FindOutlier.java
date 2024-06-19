package org.example;

public class FindOutlier {

//    DESCRIPTION:
//    You are given an array (which will have a length of at least 3, but could be very large) containing integers.
//    The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
//    Write a method that takes the array as an argument and returns this "outlier" N.
//
//            Examples
//             [2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)
//
//            [160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)

    public static void main(String[] args){
        int[] inputArray1 = {2, 4, 0, 100, 4, 11, 2602, 36};
        int actual1 = findOutlier(inputArray1);
        int expected1 = 11;
        System.out.println("Test case 1 - Actual: " + actual1 + ", Expected: " + expected1);

        // Test case 2
        int[] inputArray2 = {160, 3, 1719, 19, 11, 13, -21};
        int actual2 = findOutlier(inputArray2);
        int expected2 = 160;
        System.out.println("Test case 2 - Actual: " + actual2 + ", Expected: " + expected2);

        // Test case 3
        int[] inputArray3 = {2, 6, 8, -10, 3};
        int actual3 = findOutlier(inputArray3);
        int expected3 = 3;
        System.out.println("Test case 3 - Actual: " + actual3 + ", Expected: " + expected3);

        // Test case 4
        int[] inputArray4 = {1, 3, 5, 7, 9, 2};
        int actual4 = findOutlier(inputArray4);
        int expected4 = 2;
        System.out.println("Test case 4 - Actual: " + actual4 + ", Expected: " + expected4);

        // Test case 5
        int[] inputArray5 = {6, 8, 10, 12, 14, 17};
        int actual5 = findOutlier(inputArray5);
        int expected5 = 17;
        System.out.println("Test case 5 - Actual: " + actual5 + ", Expected: " + expected5);

        // Test case 6
        int[] inputArray6 = {21, 23, 25, 27, 29, 31, 34};
        int actual6 = findOutlier(inputArray6);
        int expected6 = 34;
        System.out.println("Test case 6 - Actual: " + actual6 + ", Expected: " + expected6);
    }

    public static int findOutlier(int[] a){
        int even = 0;
        int odd = 0;
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                sumEven++;
                even += a[i];
            }else{
                sumOdd++;
                odd += a[i];
            }
        }
        if (sumOdd == 1){
            return odd;
        }else{
            return even;
        }
    }
}
