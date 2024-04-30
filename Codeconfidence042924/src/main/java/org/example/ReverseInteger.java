package org.example;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
then return 0.
 */
//
//Method name: reverseNum
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//Example:
//Input: 123
//Output: 321
//Input: -123
//Output: -321

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Expected: 321 - Actual: " + reverseNum(123));
        System.out.println("Expected: -321 - Actual: " + reverseNum(-123));
        System.out.println("Expected: 0 - Actual: " + reverseNum(1000000023));
    }

    public static int reverseNum(int x){

        int num = x;
        if (num < 0){
            num = Math.abs(num);
        }
        String numStr = num + "";
        String resultStr = "";
        for (int i = numStr.length() -1; i >= 0;  i--){
            resultStr += numStr.charAt(i);
        }
        try {
        int result = Integer.parseInt(resultStr);
        if (x < 0){
            result *= -1;
        }
        return result;
    }catch (NumberFormatException e){
            return 0;
        }
    }

}
