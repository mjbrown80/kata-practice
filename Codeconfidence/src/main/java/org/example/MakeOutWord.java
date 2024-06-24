package org.example;

import javax.crypto.spec.PSource;

public class MakeOutWord {
//    Create a method called makeOutWord that takes in two strings, outword and word.
//    Return a new string where the word is in the middle of the outword string.
//    You can assume the length of outword is even.
//
//    For example:
//
//    makeOutWord("<<>>", "Yay") → "<<Yay>>"
//    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//    makeOutWord("[[]]", "word") → "[[word]]"

    public static void main(String[] args){
        String outword1 = "<<>>";
        String word1 = "Yay";
        String expected1 = "<<Yay>>";
        String actual1 = makeOutWord(outword1, word1);

        System.out.println("Test 1:");
        System.out.println("Outword:  " + outword1);
        System.out.println("Word:     " + word1);
        System.out.println("Expected: " + expected1);
        System.out.println("Actual:   " + actual1);
        System.out.println();

        // Test case 2
        String outword2 = "<<>>";
        String word2 = "WooHoo";
        String expected2 = "<<WooHoo>>";
        String actual2 = makeOutWord(outword2, word2);

        System.out.println("Test 2:");
        System.out.println("Outword:  " + outword2);
        System.out.println("Word:     " + word2);
        System.out.println("Expected: " + expected2);
        System.out.println("Actual:   " + actual2);
        System.out.println();

        // Test case 3
        String outword3 = "[[]]";
        String word3 = "word";
        String expected3 = "[[word]]";
        String actual3 = makeOutWord(outword3, word3);

        System.out.println("Test 3:");
        System.out.println("Outword:  " + outword3);
        System.out.println("Word:     " + word3);
        System.out.println("Expected: " + expected3);
        System.out.println("Actual:   " + actual3);
        System.out.println();
    }

    public static String makeOutWord(String outword, String word){
        String firstHalf = outword.substring(0, (outword.length()/2));
        String lastHalf= outword.substring((outword.length()/2), outword.length());

        return  firstHalf + word + lastHalf;
    }
}
