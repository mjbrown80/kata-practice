package org.example;

public class FizzBuzz {
//    Create a method called fizzBuzz with no parameters.
//    Return an array of 100 strings representing the values 1-100.
//    If the value is a multiple of both 3 and 5, put “FizzBuzz” in the array.
//    If the value is a multiple of 3 (but not 5), put “Fizz” in the array.
//    If the value is a multiple of 5 (but not 3), put “Buzz” in the array.
//    For all other values, put a string containing the value in the array.
//
//    For example:
//
//    fizzBuzz() → {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", ...}

    public static void main(String[] args){
        String[] expected = {
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz",
                "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz",
                "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz",
                "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz",
                "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz",
                "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz",
                "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
                "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz"
        };

        String[] actual = fizzBuzz();

        System.out.println("Test Result: " + "Expected" +expected + "Actual" + actual );
    }

    public static String[] fizzBuzz(){
        String[] result = new String[100];

        return result;
    }

}
