package com.swapnil.interview;

import lombok.val;

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

        validateBoard(validMatrix);


    }

    private static void validateBoard(int[][] grid) {
        //to loop 9 times through rows and columns
        for(int i=0;i< 9; i++){
            validateRow(i,grid);
        }
    }

    private static void validateRow(int i, int[][] grid) {

    }
}
