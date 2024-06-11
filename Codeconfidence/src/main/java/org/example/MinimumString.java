package org.example;

import java.util.*;

public class MinimumString {
// had to have help with this one!!!!
//    Given three strings a, b, and c, your task is to find a string that has the
//    minimum length and contains all three strings as substrings.
//    If there are multiple such strings, return the lexicographically smallest one.
//    Return a string denoting the answer to the problem.
//            Notes
//    A string a is lexicographically smaller than a string b (of the same length)
//    if in the first position where a and b differ, string a has a letter
//    that appears earlier in the alphabet than the corresponding letter in b.
//    A substring is a contiguous sequence of characters within a string.
//
//
//            Example 1:
//
//    Input: a = "abc", b = "bca", c = "aaa"
//    Output: "aaabca"
//    Explanation:  We show that "aaabca" contains all the given strings: a = ans[2...4], b = ans[3..5], c = ans[0..2].
//    It can be shown that the length of the resulting string
//    would be at least 6 and "aaabca" is the lexicographically smallest one.
//            Example 2:
//
//    Input: a = "ab", b = "ba", c = "aba"
//    Output: "aba"
//    Explanation: We show that the string "aba" contains all the given strings: a = ans[0..1], b = ans[1..2], c = ans[0..2].
//    Since the length of c is 3, the length of the resulting string
//    would be at least 3. It can be shown that "aba" is the lexicographically smallest one.

    public static void main(String[] args){

        System.out.println("Expected: aaabca " + "Actual: " + minimumString("abc", "bca", "aaa"));
        System.out.println("Expected: aba " + "Actual: " + minimumString("ab", "ba", "aba"));
        System.out.println("Expected: abcdefghi " + "Actual: " + minimumString("abc", "def", "ghi"));
        System.out.println("Expected: aaaa " + "Actual: " + minimumString("aa", "aaa", "aaaa"));
        System.out.println("Expected: xyzx " + "Actual: " + minimumString("xyz", "yzx", "zxy"));
    }

//    public static String minimumString(String a, String b, String c) {
//        List<String> list = new ArrayList<>();
//        list.add(mininumStringV2(a,b,c));
//        list.add(mininumStringV2(a,c,b));
//        list.add(mininumStringV2(b,a,c));
//        list.add(mininumStringV2(b,c,a));
//        list.add(mininumStringV2(c,a,b));
//        list.add(mininumStringV2(c,b,a));
//        Collections.sort(list,(e1, e2)->{
//            if(e1.length()!=e2.length()){
//                return e1.length()-e2.length();
//            }
//            return e1.compareTo(e2);
//        });
//        return list.get(0);
//    }
//
//    private static String mininumStringV2(String a, String b, String c){
//        if(a.contains(b) && a.contains(c)) return a;
//        if(!a.contains(b)){
//            for(int i=b.length()-1;i>=0;i--){
//                if(a.endsWith(b.substring(0,i))){
//                    a = a+b.substring(i,b.length());
//                    break;
//                }
//            }
//        }
//        if(!a.contains(c)){
//            for(int i=c.length()-1;i>=0;i--){
//                if(a.endsWith(c.substring(0,i))){
//                    a = a+c.substring(i,c.length());
//                    break;
//                }
//            }
//        }
//        return a;
//
//    }


    public static String minimumString(String a, String b, String c) {
        // Generate all permutations and merge them
        String[] permutations = {
                merge(merge(a, b), c),
                merge(merge(a, c), b),
                merge(merge(b, a), c),
                merge(merge(b, c), a),
                merge(merge(c, a), b),
                merge(merge(c, b), a)
        };

        // Find the minimum string among permutations
        String minString = permutations[0];
        for (String s : permutations) {
            if (s.length() < minString.length() || (s.length() == minString.length() && s.compareTo(minString) < 0)) {
                minString = s;
            }
        }

        return minString;
    }

    private static String merge(String a, String b) {
        // Check if a contains b
        if (a.contains(b)) return a;
        // Try to merge b into a with maximum overlap
        for (int i = Math.min(a.length(), b.length()); i > 0; i--) {
            if (a.endsWith(b.substring(0, i))) {
                return a + b.substring(i);
            }
        }
        // If no overlap, just concatenate
        return a + b;
    }

}
