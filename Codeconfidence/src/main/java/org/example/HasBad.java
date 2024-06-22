package org.example;

public class HasBad {
//    Create a method called hasBad that takes in a string called str.
//    Return true if "bad" appears starting at index 0 or 1 in str --
//    therwise return false. str may be any length, including 0.
//
//    For example:
//
//    hasBad("badxx") → true
//    hasBad("xbadxx") → true
//    hasBad("xxbadxx") → false

    public static void main(String[] args){
        boolean result1 = hasBad("badxx");
        System.out.println("Test Case 1: Expected true, Actual " + result1);

        boolean result2 = hasBad("xbadxx");
        System.out.println("Test Case 2: Expected true, Actual " + result2);

        boolean result3 = hasBad("xxbadxx");
        System.out.println("Test Case 3: Expected false, Actual " + result3);

        boolean result4 = hasBad("");
        System.out.println("Test Case 4: Expected false, Actual " + result4);

        boolean result5 = hasBad("bad");
        System.out.println("Test Case 5: Expected true, Actual " + result5);

        boolean result6 = hasBad("ba");
        System.out.println("Test Case 6: Expected false, Actual " + result6);

        boolean result7 = hasBad("xbad");
        System.out.println("Test Case 7: Expected true, Actual " + result7);

        boolean result8 = hasBad("badbad");
        System.out.println("Test Case 8: Expected true, Actual " + result8);

        boolean result9 = hasBad("goodbad");
        System.out.println("Test Case 9: Expected false, Actual " + result9);
    }

    public static boolean hasBad(String str){
        if(str.length() <= 2){
            return false;
        }if (str.substring(0,3).contains("bad") || str.substring(1,4).contains("bad")){
            return true;
        }
        return false;
    }
}
