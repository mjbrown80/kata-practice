package org.example;

public class ThreeConsecutiveOdds {

    public static void main(String[] args){

            test(new int[]{2, 6, 4, 1}, false);
            test(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}, true);
            test(new int[]{1, 3, 5, 7, 9}, true);
            test(new int[]{2, 4, 6, 8, 10}, false);
            test(new int[]{1, 2, 3, 5, 7}, true);
        }

        private static void test(int[] arr, boolean expected) {
            boolean actual = threeConsecutiveOdds(arr);
            System.out.println("Expected: " + expected + ", Actual: " + actual);
        }


    public static boolean threeConsecutiveOdds(int[] arr){

        for (int i = 0; i < arr.length -2; i++){
            if(arr[i] % 2 != 0 && arr[i+1] % 2 != 0 && arr[i+2] % 2 != 0){
                return true;
            }
        }
    return false;
}
}