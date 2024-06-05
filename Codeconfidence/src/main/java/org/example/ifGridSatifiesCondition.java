package org.example;

public class ifGridSatifiesCondition {
// leet code
//    You are given a 2D matrix grid of size m x n. You need to check if each cell grid[i][j] is:
//    Equal to the cell below it, i.e. grid[i][j] == grid[i + 1][j] (if it exists).
//    Different from the cell to its right, i.e. grid[i][j] != grid[i][j + 1] (if it exists).
//    Return true if all the cells satisfy these conditions, otherwise, return false.
//
//    Example 1:
//    Input: grid = [[1,0,2],[1,0,2]]
//    Output: true
//    Explanation:
//    All the cells in the grid satisfy the conditions.
//
//            Example 2:
//    Input: grid = [[1,1,1],[0,0,0]]
//    Output: false
//    Explanation:
//    All cells in the first row are equal.
//
//    Example 3:
//    Input: grid = [[1],[2],[3]]
//    Output: false
//    Explanation:
//    Cells in the first column have different values.
//
//    Constraints:
//            1 <= n, m <= 10
//            0 <= grid[i][j] <= 9
    public static void main(String[] args){

        int[][] grid1 = {{1}, {2}, {3}};
        System.out.println("Test 1: Expected: false | Actual: " + satisfiesConditions(grid1));

        int[][] grid2 = {{1, 1, 1}, {0, 0, 0}};
        System.out.println("Test 2: Expected: false | Actual: " + satisfiesConditions(grid2));

        int[][] grid3 = {{1, 0, 2}, {1, 0, 2}};
        System.out.println("Test 3: Expected: true | Actual: " + satisfiesConditions(grid3));
    }

    public static boolean satisfiesConditions(int[][] grid){
        if (grid.length < 2){
            return false;
        }
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] != grid[i+1][j]){
                    return false;
                }else {
                    return true;
                }
            }
        }
        return false;
    }
}
