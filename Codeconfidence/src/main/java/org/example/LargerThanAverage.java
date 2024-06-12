package org.example;

public class LargerThanAverage {
    /*
Write a method called largerThan that takes in an array of integers and a single integer.  Determine if the integer values is larger than the average and return true. Otherwise return false

Examples:
  largerThan({5, 5, 5} , 4) => true
  largerThan({1, 3, 5, 4}, 4) => false
  largerThan({0}, -2) => true

*/
public static void main(String[] args){
    System.out.println("Expected: true - Actual: " + largerThan (new int[] { 5, 5, 5}, 4));
    System.out.println("Expected: false - Actual: " + largerThan (new int[] { 1, 3, 5, 4}, 4));
    System.out.println("Expected: true - Actual: " + largerThan (new int[] {0}, -2));
}

public static boolean largerThan(int[] a, int b){
    int sum = 0;
    int average = 0;

    for (int i = 0; i < a.length; i++){
        sum += a[i];
    }

    average = sum / a.length;
    if (average > b){
        return true;
    }
    return false;
}
}
