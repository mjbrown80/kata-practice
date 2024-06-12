package org.example;

public class BowlingWinner {
//leetcode
//    You are given two 0-indexed integer arrays player1 and player2,
//    representing the number of pins that player 1 and player 2 hit in a bowling game, respectively.
//    The bowling game consists of n turns, and the number of pins in each turn is exactly 10.
//    Assume a player hits xi pins in the ith turn. The value of the ith turn for the player is:
//            2xi if the player hits 10 pins in either (i - 1)th or (i - 2)th turn.
//    Otherwise, it is xi.
//    The score of the player is the sum of the values of their n turns.
//            Return
//1 if the score of player 1 is more than the score of player 2,
//            2 if the score of player 2 is more than the score of player 1, and
//0 in case of a draw.
//            Example 1:
//    Input: player1 = [5,10,3,2], player2 = [6,5,7,3]
//    Output: 1
//    Explanation:
//    The score of player 1 is 5 + 10 + 2*3 + 2*2 = 25.
//    The score of player 2 is 6 + 5 + 7 + 3 = 21.
//    Example 2:
//    Input: player1 = [3,5,7,6], player2 = [8,10,10,2]

//    Output: 2
//    Explanation:
//    The score of player 1 is 3 + 5 + 7 + 6 = 21.
//    The score of player 2 is 8 + 10 + 2*10 + 2*2 = 42.

//    Example 3:
//    Input: player1 = [2,3], player2 = [4,1]
//    Output: 0
//    Explanation:
//    The score of player1 is 2 + 3 = 5.
//    The score of player2 is 4 + 1 = 5.
//
//    Example 4:
//    Input: player1 = [1,1,1,10,10,10,10], player2 = [10,10,10,10,1,1,1]
//    Output: 1
//    Explanation:
//    The score of player1 is 1 + 1 + 1 + 10 + 2*10 + 2*10 + 2*10 = 73.
//    The score of player2 is 10 + 2*10 + 2*10 + 2*10 + 2*1 + 2*1 + 1 = 75.
//
//    Constraints:
//    n == player1.length == player2.length
//1 <= n <= 1000
//            0 <= player1[i], player2[i] <= 10

    public static void main(String[] args){
        int[] player1_1 = {5, 10, 3, 2};
        int[] player2_1 = {6, 5, 7, 3};
        int expected1 = 1;
        System.out.println("Expected: " + expected1 + " Actual: " + isWinner(player1_1, player2_1));

        int[] player1_2 = {3, 5, 7, 6};
        int[] player2_2 = {8, 10, 10, 2};
        int expected2 = 2;
        System.out.println("Expected: " + expected2 + " Actual: " + isWinner(player1_2, player2_2) );

        int[] player1_3 = {2, 3};
        int[] player2_3 = {4, 1};
        int expected3 = 0;
        System.out.println("Expected: " + expected3 + " Actual: " + isWinner(player1_3, player2_3) );

        int[] player1_4 = {1, 1, 1, 10, 10, 10, 10};
        int[] player2_4 = {10, 10, 10, 10, 1, 1, 1};
        int expected4 = 2;
        System.out.println("Expected: " + expected4 + " Actual: " + isWinner(player1_4, player2_4));
    }

    public static int isWinner(int[] player1, int[] player2){
        int sumP1 = 0;
        int sumP2 = 0;

        for (int i = 0; i < player1.length; i++){
            if ((i > 0 && player1[i - 1] == 10) || (i > 1 && player1[i-2]  == 10)){
                sumP1 += player1[i] * 2;
            }else {
                sumP1 += player1[i];
            }
            if ((i > 0 && player2[i - 1] == 10) || (i > 1 && player2[i-2]  == 10)){
                sumP2 += player2[i] * 2;
            }else {
                sumP2 += player2[i];
            }
        }

        if (sumP1 > sumP2){
            return 1;
        } else if (sumP2 > sumP1) {
            return 2;
        }
        return 0;
    }
}
