package org.example;

public class startsWithOne {
//    Create a method called start1 that takes in two integer arrays a and b.
//    Return how many of the arrays have 1 as their first element.
//
//    For example:
//
//    start1({1, 2, 3}, {1, 3}) → 2
//    start1({7, 2, 3}, {1}) → 1
//    start1({2, 1}, {}) → 0
    public static void main(String[] args){
        int[] testArray1A = {1, 2, 3};
        int[] testArray1B = {1, 3};
        System.out.println("Test Case 1: Expected 2, Actual " + start1(testArray1A, testArray1B));

        int[] testArray2A = {7, 2, 3};
        int[] testArray2B = {1};
        System.out.println("Test Case 2: Expected 1, Actual " + start1(testArray2A, testArray2B));

        int[] testArray3A = {2, 1};
        int[] testArray3B = {};
        System.out.println("Test Case 3: Expected 0, Actual " + start1(testArray3A, testArray3B));
    }

    public static int start1(int[] a, int[] b){

        int totalOnes = 0;

        if (a.length > 0 && a[0] ==1){
            totalOnes++;
        }
        if (b.length > 0 && b[0] == 1){
            totalOnes++;
        }
        return totalOnes;
//        if(a[0] == 1 && b[0] == 1){
//            return 2;
//        }else if((a[0] != 1 && b[0] !=1) && (a.length == 0 && b.length == 0)){
//            return 0;
//        } else if (((a[0] != 1 && b[0] ==1) || (a[0] == 1 && b[0] !=1) || (a.length == 0 && b[0] ==1) || (a[0] == 1 && b.length == 0))) {
//            return 1;
//        }
//
//        return 1;
    }
}
