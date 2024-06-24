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
        String[] fizzBuzzResult = fizzBuzz();


        for (String value: fizzBuzzResult){
            System.out.println(value);
        }
    }

    public static String[] fizzBuzz(){
        String[] result = new String[100];

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 ==0){
                result[i-1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i-1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i-1] = "Buzz";
            }else {
                result[i-1] = String.valueOf(i);
            }
        }

        return  result;
    }

}
