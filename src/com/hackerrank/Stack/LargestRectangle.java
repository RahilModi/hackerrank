package com.hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {
    static long largestRectangle(int[] h) {
        // Complete this function
        int max_area = 0;
        Stack<Integer> stack = new Stack<>();
        int tp=0,area =0;
        int i =0;
        while(i<h.length){
            if(stack.isEmpty() || h[stack.peek()]<= h[i]){
                stack.push(i);
                i++;
            }else{
                tp = stack.peek();
                stack.pop();
                area = h[tp] * (stack.isEmpty()?i:i-stack.peek()-1);

                if(max_area < area){
                    max_area = area;
                }
            }
        }
        while(!stack.isEmpty()){
            tp = stack.peek();
            stack.pop();
            area = h[tp] * (stack.isEmpty()?i:i- stack.peek()-1);

            if(max_area < area){
                max_area = area;
            }
        }
        return max_area;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for(int h_i = 0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        long result = largestRectangle(h);
        System.out.println(result);
        in.close();
    }
}
