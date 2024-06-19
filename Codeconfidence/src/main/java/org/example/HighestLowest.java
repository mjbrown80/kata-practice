package org.example;

public class HighestLowest {
    public static void main(String[] args){
        String input1 = "1 2 3 4 5";
        String actual1 = highestLowest(input1);
        String expected1 = "5 1";
        System.out.println("Test case 1 - Actual: " + actual1 + ", Expected: " + expected1);

        // Test case 2
        String input2 = "1 2 -3 4 5";
        String actual2 = highestLowest(input2);
        String expected2 = "5 -3";
        System.out.println("Test case 2 - Actual: " + actual2 + ", Expected: " + expected2);

        // Test case 3
        String input3 = "1 9 3 4 -5";
        String actual3 = highestLowest(input3);
        String expected3 = "9 -5";
        System.out.println("Test case 3 - Actual: " + actual3 + ", Expected: " + expected3);
    }
    public static String highestLowest(String numbers){
        String[] numberArr = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String number : numberArr){
            int num = Integer.parseInt(number);
            if (num > max){
                max = num;
            }if (num < min){
                min = num;
            }
        }
        return max + " " + min;
    }
}
