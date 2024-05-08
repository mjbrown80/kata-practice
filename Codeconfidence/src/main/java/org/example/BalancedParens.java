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

    public static boolean validParentheses(String str){
        // if str is null, return false
        if (str == null ){
            return false;
        }
        //if length is 0, return true
        if (str.length() == 0){
            return true;
        }  //or if length is 1 and char is not '(' or ')' return true
        //if length is 1 and char is '(' or')' return false
        if (str.length() ==1) {
            if (str.charAt(0) =='(' || str.charAt(0) == ')'){
                return false;
            }
            return true;
        }
        //create a counter = 0
        int counter = 0;
        //loop through the string
        for (int i = 0; i < str.length(); i++){
            //if char is '(' counter++
            if (str.charAt(i) == '('){
                counter++;
            } //if char is ')' counter--
            else if (str.charAt(i) == ')') {
                counter--;
            }
            if (counter < 0){
                return false;
            }
            //if counter < 0 return false
        }//after loop if counter 0 return true
        if (counter == 0){
            return true;
        }//otherwise return false
            return false;
    }
}
