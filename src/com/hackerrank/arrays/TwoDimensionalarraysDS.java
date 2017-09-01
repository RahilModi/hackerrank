package com.hackerrank.arrays;
import java.io.*;
import java.util.*;

public class TwoDimensionalarraysDS {

    //classic hour glass problem
    public static void main(String[] args) {

        int[][] matrix = new int[6][6];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int startRowPos = 1;
        int startColPos = 1;
        for(int i = startRowPos; i < 5; i++){
            for(int j = startColPos; j < 5; j++){
                int sum = 0;
                for(int k = i-1 ; k <= i + 1; k++){
                    for(int l = j-1 ; l <= j + 1 ; l++){
                        if(k == i && l != j){
                            continue;
                        }
                        sum+=matrix[k][l];
                    }
                }
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);

    }
}
