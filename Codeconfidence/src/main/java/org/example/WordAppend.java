package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

//    Write a method called wordAppend/WordAppend that loops over
//    the given array of strings to build a result string like this:
//    When a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
//    Return the empty string if no string appears a 2nd time.
//
//    Hint: A Map/Dictionary could be helpful here!
//
//    wordAppend(["a", "b", "a"]) → "a"
//    wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
//    wordAppend(["a", "", "a"]) → "a"

    public static void main(String[] args) {
        // Tests
        String[] strArray1 = { "a", "b", "c" };
        System.out.println("Expected: empty string | Actual: " + wordAppend(strArray1));

        String[] strArray2 = { "cat", "dog", "cat", "dog", "cat" };
        System.out.println("Expected: \"catdog\" | Actual: " + wordAppend(strArray2));

        String[] strArray3 = { "duck", "duck", "duck", "duck", "duck", "duck", "goose!" };
        System.out.println("Expected: \"duckduckduck\" | Actual: " + wordAppend(strArray3));

    }

    public static String wordAppend(String[] str){
        String word = "";
        Map<String, Integer> every2nd = new HashMap<String, Integer>();
        for (int i = 0; i < str.length; i++){
            if (every2nd.containsKey(str[i])){
                int value = every2nd.get(str[i]) + 1;
                every2nd.put(str[i], value);
                if (value % 2 == 0){
                    word += str[i];
                }
            }else {
                every2nd.put(str[i], 1);
            }
        }
        return word;
    }

}
