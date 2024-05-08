package org.example;

import java.util.HashMap;
import java.util.Map;

public class mapAB {
//    Prompt: Write a method called mapAB that modifies
//    and returns a given <String, String> map as follows
//    - For this problem, the map may or may not contain the "a" and "b" keys.
//    If both keys are present, append their 2 string values together and store
//    the result under the key "ab"; otherwise, return the map with its original contents.
//            * * */


    public static void main(String[] args) {
        // Tests
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");
        System.out.println("Expected: {a=Hi, ab=HiThere, b=There} | Actual: " + mapAB(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hello");
        System.out.println("Expected: {a=Hello} | Actual: " + mapAB(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("c", "Bonjour");
        map3.put("d", "Hola");
        System.out.println("Expected: {c=Bonjour, d=Hola} | Actual: " + mapAB(map3));
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        String ab = "";
        if (map.containsKey("a") && map.containsKey("b")) {
            ab = map.get("a") + map.get("b");
            map.put("ab", ab);
        }
        return map;
    }
}
