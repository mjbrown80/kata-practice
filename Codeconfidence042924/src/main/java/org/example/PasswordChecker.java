package org.example;

public class PasswordChecker
{
//    Problem:
//    You are building a password strength checker for a web application.
//    The password criteria are as follows:
//
//    The password must contain at least 8 characters.
//    The password must contain at least one uppercase letter (A-Z).
//    The password must contain at least one lowercase letter (a-z).
//    The password must contain at least one digit (0-9).
//    The password must contain at least one special character (e.g., !, @, #, $, %, ^, &, *).
//    Your task is to implement a function called isStrongPassword that
//    takes a password as input and returns a boolean value indicating
//    whether the password meets the above criteria or not.

    public static void main(String[] args) {
        System.out.println(isStrongPassword("Abcd1234@"));  // Output: true
        System.out.println(isStrongPassword("helloWorld")); // Output: false
        System.out.println(isStrongPassword("P@ssw0rd"));   // Output: true
        System.out.println(isStrongPassword("12!45^67"));  // Output: false
        System.out.println(isStrongPassword("Abc1234"));   // Output: false
    }

    public static boolean isStrongPassword(String password){

        if (password.length() < 8){
            return false;
        }
        boolean containsUpper = false;
        boolean containsLower = false;
        boolean containsNumber = false;
        boolean containsSpecial = false;
        String specialChars = "!@#$%^&*";

        for (int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)){
                containsUpper = true;
            } else if (Character.isLowerCase(ch)) {
                containsLower = true;
            } else if (Character.isDigit(ch)) {
                containsNumber = true;
            } else if (specialChars.contains(ch + "")) {
                containsSpecial = true;

            }
        }
        return containsLower && containsNumber && containsSpecial && containsNumber;
    }
}


