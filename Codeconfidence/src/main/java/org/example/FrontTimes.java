package org.example;

public class FrontTimes {
//    Create a method called frontTimes that takes in a string str and an integer n.
//    The front of str is the first 3 characters, or whatever is there
//    if str is less than length 3. Return a string made up of n copies of the front.
//
//    For example:
//
//    frontTimes("Chocolate", 2) → "ChoCho"
//    frontTimes("Chocolate", 3) → "ChoChoCho"
//    frontTimes("Ab", 3) → "AbAbAb"

    public static void main(String[] args){
        String str1 = "Chocolate";
        int n1 = 2;
        String expected1 = "ChoCho";
        String actual1 = frontTimes(str1, n1);
        System.out.println("Test case 1:");
        System.out.println("Input: (" + str1 + ", " + n1 + ")");
        System.out.println("Expected: " + expected1);
        System.out.println("Actual: " + actual1);
        System.out.println();

        String str2 = "Chocolate";
        int n2 = 3;
        String expected2 = "ChoChoCho";
        String actual2 = frontTimes(str2, n2);
        System.out.println("Test case 2:");
        System.out.println("Input: (" + str2 + ", " + n2 + ")");
        System.out.println("Expected: " + expected2);
        System.out.println("Actual: " + actual2);
        System.out.println();

        String str3 = "Ab";
        int n3 = 3;
        String expected3 = "AbAbAb";
        String actual3 = frontTimes(str3, n3);
        System.out.println("Test case 3:");
        System.out.println("Input: (" + str3 + ", " + n3 + ")");
        System.out.println("Expected: " + expected3);
        System.out.println("Actual: " + actual3);
        System.out.println();

        String str4 = "Chocolate";
        int n4 = 1;
        String expected4 = "Cho";
        String actual4 = frontTimes(str4, n4);
        System.out.println("Test case 4:");
        System.out.println("Input: (" + str4 + ", " + n4 + ")");
        System.out.println("Expected: " + expected4);
        System.out.println("Actual: " + actual4);
        System.out.println();

        String str5 = "Ab";
        int n5 = 1;
        String expected5 = "Ab";
        String actual5 = frontTimes(str5, n5);
        System.out.println("Test case 5:");
        System.out.println("Input: (" + str5 + ", " + n5 + ")");
        System.out.println("Expected: " + expected5);
        System.out.println("Actual: " + actual5);
        System.out.println();

        String str6 = "";
        int n6 = 4;
        String expected6 = "";
        String actual6 = frontTimes(str6, n6);
        System.out.println("Test case 6:");
        System.out.println("Input: (" + str6 + ", " + n6 + ")");
        System.out.println("Expected: " + expected6);
        System.out.println("Actual: " + actual6);
        System.out.println();

        String str7 = "Hi";
        int n7 = 4;
        String expected7 = "HiHiHiHi";
        String actual7 = frontTimes(str7, n7);
        System.out.println("Test case 7:");
        System.out.println("Input: (" + str7 + ", " + n7 + ")");
        System.out.println("Expected: " + expected7);
        System.out.println("Actual: " + actual7);
        System.out.println();


        String str8 = "A";
        int n8 = 3;
        String expected8 = "AAA";
        String actual8 = frontTimes(str8, n8);
        System.out.println("Test case 8:");
        System.out.println("Input: (" + str8 + ", " + n8 + ")");
        System.out.println("Expected: " + expected8);
        System.out.println("Actual: " + actual8);
        System.out.println();
    }

    public static String frontTimes(String str, int n){
        String result = "";
        if(str.length() == 0){
            return str;
        }
        for (int i = 0; i < n; i++){
            if (str.length() <= 2){
                result += str;
            }else{
                String sub = str.substring(0,3);
                result += sub;
            }
        }


        return result;
    }
}
