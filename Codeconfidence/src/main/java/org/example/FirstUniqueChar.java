package org.example;

public class FirstUniqueChar {

    public static void main(String[] args){
        test("leetcode", 0);
        test("loveleetcode", 2);
        test("aabb", -1);
        test("aabbccddee", -1);
        test("abcd", 0);
    }

    private static void test(String s, int expected) {
        int actual = firstUniqueChar(s);
        System.out.println("Input: \"" + s + "\" Expected: " + expected + ", Actual: " + actual);
    }

    public static int firstUniqueChar(String s){

        for (int i = 0; i < s.length(); i++){
            boolean isUnique = true;

            for (int j = 0; j < s.length(); j++){
                if (i != j && s.charAt(j) == s.charAt(i)){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique){
                return i;
            }
        }
        return -1;
    }

}
