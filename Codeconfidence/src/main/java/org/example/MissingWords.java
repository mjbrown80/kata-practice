package org.example;

public class MissingWords {

    /* Given two strings, one is a subsequence of all the elements of the first string that occurs in the same order within the second string.
They don't have to be contiguous in the second string but the order must be maintained. For example,
given the string "I like cheese" the word ("I" and "cheese") are one possible subsequence of that string. Words are space delimited.
Given two strings S and T where t is a subsequence of S, report the words of s, missing in T(case Sensitive), in the order, they are missing.
Input
The first line of each test case contains a string S that may be in form of many words separated by spaces
The second of each test case contains a string T that is a subsequence of string S that also may be in form of many words separated by spaces.
Output
For each test case print the list of words that are missing in the same order. If string A completely match with string B return 0
Example
input
I am using Replit to improve programming
am Replit
output
I using to improve programming
Note
Example:
S="I like cheese"
T="like"
Then the "like is the subsequence and ["I", "cheese] in the list of missing words,in order
*/

    public static void main(String[] args) {
        String input = "I am using Replit to improve programming";
        String result = "I using to improve programming";
        String search = "am Replit";
        System.out.println("Expected: " + result + " Actual: " + removeWords(input, search));
        input = "Here is a brand new line";
        result = "Here a new";
        search = "is brand line";
        System.out.println("Expected: " + result + " Actual: " + removeWords(input, search));

    }

    public static String removeWords(String string1, String subSeq){
        String[] subStrings = subSeq.split(" ");
        for (String s : subStrings){
            if (string1.contains(s)){
               string1 =  string1.replaceAll(s, "");
            }
        }
        string1 = string1.replaceAll("  ", " ");
        return string1;
    }
//    public static String removeWords(String str1, String strSub){
//        String str = "";
//        String[] subStrings = strSub.split(" ");
//        String [] stringStr = str1.split(" ");
//
//        for (String words : stringStr){
//            boolean isFound = false;
//            for (String s : subStrings){
//                if (s.equals(words)){
//                    isFound = true;
//                }
//            }
//            if (!isFound)  {
//                str += words + " ";
//            }
//        }
//
//        return str;
//    }
}
