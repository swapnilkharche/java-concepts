package com.swapnil.interview;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {

    public static void main(String[] args) {
        //invalid board
        int[][] invalidMatrix={

                {5,5,5,5,5,5,5,5,5},
                {1,2,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5},

                {5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5},

                {5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5},
                {5,5,5,5,5,5,5,5,5}

        };
        //valid board
        int[][] validMatrix={

                {5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},

                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},

                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}

        };

        //validateBoard(validMatrix);

        if(validateBoardOptimized(validMatrix)){
            System.out.println("Given matrix is valid! (Optimized)");
        }else{
            System.out.println("Given matrix is not valid! (Optimized)");
        }
    }

    //Optimized solution for Valid sudoku problem
    //Time complexity O (n^2); here it is O(81)
    private static boolean validateBoardOptimized(int[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]!=0) {
                    if (!seen.add("row " + i + " has number " + board[i][j]) ||
                            !seen.add("col " + j + " has number " + board[i][j]) ||
                            //
                            !seen.add("box " + (i / 3) + "+" + (j / 3) + " has number " + board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static void validateBoard(int[][] grid) {
        //to loop 9 times through rows and columns
        for(int i=0;i< 9; i++){
            int res1 = validateRow(i,grid);
            int res2 = validateCol(i,grid);

            if(res1 < 1 || res2 < 1){
                System.out.println("Invalid board!");
                return;
            }

        }
        int res3 = validateSubMatrix(grid);
        // if any one the subsquares is invalid, then the board is invalid.
        if (res3 < 1) {
            System.out.println( "Invalid board!" );
        }
        else {
            System.out.println( "Valid board!" );
        }
    }

    private static int validateSubMatrix(int[][] grid) {
        for (int row = 0; row < 9; row+=3) {
            for (int col = 0; col < 9; col+=3) {
                Set<Integer>set = new HashSet<Integer>();
                for(int r = row; r < row+3; r++) {
                    for(int c= col; c < col+3; c++){
                        // Checking for values outside 0 and 9;
                        // 0 is considered valid because it
                        // denotes an empty cell.
                        // Removing zeros and the checking for values and
                        // outside 1 and 9 is another way of doing
                        // the same thing.
                        if (grid[r][c] < 0 || grid[r][c] > 9){
                            System.out.println( "Invalid value" );
                            return -1;
                        }
                        // Checking for repeated values.
                        else if (grid[r][c] != 0){
                            if (set.add(grid[r][c]) == false) {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        return 1;
        
    }

    private static int validateCol(int col, int[][] grid) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<9;i++){
            if(set.add(grid[i][col]) == false){
                return 0;
            }
        }
        return 1;
    }

    private static int validateRow(int row, int[][] grid) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<9;i++){
            if(set.add(grid[row][i]) == false){
                return 0;
            }
        }
        return 1;
    }
}
