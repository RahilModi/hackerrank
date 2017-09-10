package com.hackerrank.Stack;



import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class PosionousPlants {
    static int poisonousPlants(int[] p) {

        int [] days = new int[p.length];
        int min = p[0];
        int max = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);

        for(int i =1;i<p.length;i++){
            if(p[i] > p[i-1]) days[i] = 1;
            min = min < p[i] ? min : p[i];
            while(!stack.empty() && p[stack.peek()] >= p[i]){
                if(p[i]>min){
                    days[i]=days[i]>days[stack.peek()]+1 ? days[i]:days[stack.peek()]+1;
                }
                stack.pop();
            }
            max = max > days[i]?max:days[i];
            stack.push(i);
        }return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int result = poisonousPlants(p);
        System.out.println(result);
        in.close();
    }
}