package org.example;

public class doubleX {
//    Create a method called doubleX that takes in a string called str.
//    Return true if the first instance of "x" in str is immediately followed by another "x" -- otherwise return false.
//
//    For example:
//
//    doubleX("axxbb") → true
//    doubleX("axaxax") → false
//    doubleX("xxxxx") → true

    public static void main(String[] args){
        System.out.println("Test Case 1: Expected true, Actual " + doubleX("axxbb"));
        System.out.println("Test Case 2: Expected false, Actual " + doubleX("axaxax"));
        System.out.println("Test Case 3: Expected true, Actual " + doubleX("xxxxx"));
        System.out.println("Test Case 4: Expected false, Actual " + doubleX("abc"));
        System.out.println("Test Case 5: Expected false, Actual " + doubleX("x"));
        System.out.println("Test Case 6: Expected true, Actual " + doubleX("xx"));
        System.out.println("Test Case 7: Expected true, Actual " + doubleX("aaxx"));
        System.out.println("Test Case 8: Expected false, Actual " + doubleX(""));
    }

    public static boolean doubleX(String str){
        String xx = "xx";
        if (str.length() == 0){
            return false;
        }
        if (str.substring(0,str.length()-1).contains(xx)){
            return true;
        }
        return false;
    }
}
