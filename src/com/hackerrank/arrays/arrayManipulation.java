package com.hackerrank.arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class arrayManipulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [] nums = new int[n+1];
        long max = Long.MIN_VALUE;
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            nums[a-1] += k;
            if(b <= n){
                nums[b] -= k;
            }
        }
        long temp = 0;
        for(int i = 0;i<=n;i++){
            temp += nums[i];
            if(temp > max) max = temp;
        }

        System.out.println(max);
        in.close();
    }
}
