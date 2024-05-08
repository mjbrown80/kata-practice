package org.example;

public class BalancedParens {
//    Write a method that takes a string of parentheses, and determines if the order of the parentheses is valid.
//    The method should return true if the string is valid, and false if it's invalid.  Method name is ValidParentheses
//
//    Examples
//        "()"              =>  true
//        ")(()))"          =>  false
//        "("               =>  false
//        "(())((()())())"  =>  true
//    Constraints
//         0 <= input.length <= 100
//
//    Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters.
//    Furthermore, the input string may be empty and/or not contain any parentheses at all.
//    Do not treat other forms of brackets as parentheses (e.g. [], {}, <>).

    public static void main(String[] args) {
        System.out.println("Expected: true, Actual: " + validParentheses("()"));
        System.out.println("Expected: false, Actual: " + validParentheses(")(()))"));
        System.out.println("Expected: true, Actual: " + validParentheses("(())((()())())"));
        System.out.println("Expected: false, Actual: " + validParentheses(")(())((()())()"));
        System.out.println("Expected: true, Actual: " + validParentheses(" (())((()()))()"));
        System.out.println("Expected: true, Actual: " + validParentheses(""));
    }

    public static boolean validParentheses(String parens){
        for (int i = 0; i < parens.length(); i++){
            
        }
        return true;
    }
}
