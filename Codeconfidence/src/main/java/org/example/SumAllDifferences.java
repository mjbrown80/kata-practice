package org.example;

public class SumAllDifferences {
    /*
Write a method called sumDifferences that takes in an array of integers
and sums the differences between each interval of pairs.
The array will contain an even number of elements.

Example:
  sumDifferences([3, 5, 6, 8, 1, 5, 13, 17])  =>  12
  sumDifferences([5, 4, 8, 3, 12, 16, 13, 13])  => 10

*/

    public static void main(String[] args) {

        System.out.println("Expected: 12   Actual: " +
                sumDifferences(new int[]{3, 5, 6, 8, 1, 5, 13, 17}));

        System.out.println("Expected: 10   Actual: " +
                sumDifferences(new int[]{5, 4, 8, 3, 12, 16, 13, 13}));

    }

    public static int sumDifferences(int[] nums){
        int sum = 0;

        for(int i = 0; i < nums.length; i+=2){
//            int difference = 0;
//            if(nums[i] <= nums[i + 1]){
//                difference = nums[i+1] -= nums[i] ;
//                sum += difference;
//                sum += nums[i+1] - nums[i];
//            }else{
//                difference = nums[i] -= nums[i+1];
//                sum += difference;
//                sum += nums[i] - nums[i+1];
//            }
            sum += Math.abs(nums[i] -= nums[i+1]);
        }
        return sum;
    }
    }
