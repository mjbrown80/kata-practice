package org.example;

public class needleHaystack {

//    Given two strings needle and haystack,
//    return the index of the first occurrence of needle in haystack,
//    or -1 if needle is not part of haystack.

//    Example 1:
//
//    Input: haystack = "sadbutsad", needle = "sad"
//    Output: 0
//    Explanation: "sad" occurs at index 0 and 6.
//    The first occurrence is at index 0, so we return 0.
//    Example 2:
//
//    Input: haystack = "leetcode", needle = "leeto"
//    Output: -1
//    Explanation: "leeto" did not occur in "leetcode", so we return -1.
//
//    Constraints:
//
//            1 <= haystack.length, needle.length <= 104
//    haystack and needle consist of only lowercase English characters.

    public static void main(String[] args){
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int expected1 = 0;
        int actual1 = strStr(haystack1, needle1);
        System.out.println("Test case 1: Expected: " + expected1 + ", Actual: " + actual1);

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int expected2 = -1;
        int actual2 = strStr(haystack2, needle2);
        System.out.println("Test case 2: Expected: " + expected2 + ", Actual: " + actual2);

        String haystack3 = "mississippi";
        String needle3 = "issip";
        int expected3 = 4;
        int actual3 = strStr(haystack3, needle3);
        System.out.println("Test case 3: Expected: " + expected3 + ", Actual: " + actual3);

        String haystack4 = "a";
        String needle4 = "a";
        int expected4 = 0;
        int actual4 = strStr(haystack4, needle4);
        System.out.println("Test case 4: Expected: " + expected4 + ", Actual: " + actual4);

        String haystack5 = "aaa";
        String needle5 = "aaaa";
        int expected5 = -1;
        int actual5 = strStr(haystack5, needle5);
        System.out.println("Test case 5: Expected: " + expected5 + ", Actual: " + actual5);

        String haystack6 = "abc";
        String needle6 = "c";
        int expected6 = 2;
        int actual6 = strStr(haystack6, needle6);
        System.out.println("Test case 6: Expected: " + expected6 + ", Actual: " + actual6);

        String haystack7 = "abcabc";
        String needle7 = "cab";
        int expected7 = 2;
        int actual7 = strStr(haystack7, needle7);
        System.out.println("Test case 7: Expected: " + expected7 + ", Actual: " + actual7);

        String haystack8 = "needlehaystack";
        String needle8 = "needle";
        int expected8 = 0;
        int actual8 = strStr(haystack8, needle8);
        System.out.println("Test case 8: Expected: " + expected8 + ", Actual: " + actual8);

        String haystack9 = "abcdefgh";
        String needle9 = "gh";
        int expected9 = 6;
        int actual9 = strStr(haystack9, needle9);
        System.out.println("Test case 9: Expected: " + expected9 + ", Actual: " + actual9);

        String haystack10 = "abracadabra";
        String needle10 = "cad";
        int expected10 = 4;
        int actual10 = strStr(haystack10, needle10);
        System.out.println("Test case 10: Expected: " + expected10 + ", Actual: " + actual10);

    }

    public static int strStr(String haystack, String needle){
//        int haystackLength = haystack.length();
//        int needleLength = needle.length();
//
//        if (needleLength > haystackLength){
//            return -1;
//        } else if ( needle.length() == 0) {
//            return 0;
//        }
//        for (int i = 0; i <= haystackLength - needleLength; i++){
//            for (int j = 0; j < needleLength; j++){
//                if (haystack.charAt(i + j) != needle.charAt(j)){
//                    break;
//                }
//                if (j == needleLength-1){
//                    return i;
//            }
//            }
//        }
//        return -1;
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if(needleLength > haystackLength){
            return -1;
        }

        for (int i = 0; i <= haystackLength - needleLength; i++){
            if (haystack.substring(i, i + needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
