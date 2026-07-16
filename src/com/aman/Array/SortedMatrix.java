package com.aman.Array;

// find the target in the row and column sorted matrix
// 10 15 18 23
// 12 19 21 26
// 19 25 30 41
// 22 35 42 56
import java.util.Arrays;

class SortedMatrix{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {11, 12, 13, 14}
        };
        int target = 8;
    // print the returned int[] in a readable form
    System.out.println(Arrays.toString(search(matrix, target)));

    }
    static  int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            else if(target<matrix[row][col]){
                col--;
            }
            else if(target>matrix[row][col]){
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}