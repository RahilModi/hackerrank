package com.hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        int step;
        for(int a0 = 0; a0 < g; a0++){

            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
            // your code goes here

            Stack<Integer> stack1 = new Stack<Integer>();
            Stack<Integer> stack2 = new Stack<Integer>();

            for(int i = a.length ; i > 0 ;i--){
                stack1.push(a[i-1]);
            }
            for(int i = b.length ; i > 0 ;i--){
                stack2.push(b[i-1]);
            }

            int sum = 0;
            int j=0,i=0;

            step = 0;

            if (stack1.peek() > x && stack2.peek() > x) {
                System.out.println(step);
                continue;
            }

            while (!stack1.empty() && sum + stack1.peek()<=x){
                sum += stack1.pop();
                i++;
            }
            step = i;

            while (j < m && i >= 0) {

                sum += stack2.pop();
                j++;
                while (sum>x && i>0){
                    sum -= a[i-1];
                    i--;
                }
                if(sum<=x && i+j>step) {
                    step = i + j;
                }
            }
            System.out.println(step);

        }
    }
}
