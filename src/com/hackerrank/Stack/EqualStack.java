package com.hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class EqualStack {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int n3 = in.nextInt();
    int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
        h1[h1_i] = in.nextInt();
    }
    int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
        h2[h2_i] = in.nextInt();
    }
    int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
        h3[h3_i] = in.nextInt();
    }
    Stack<Integer> stack1 =  new Stack<>();
    Stack<Integer> stack2 =  new Stack<>();
    Stack<Integer> stack3 =  new Stack<>();
    int sum1=0,sum2=0,sum3=0;
        for(int i = h1.length;i>0 ; i--){
        stack1.push(h1[i-1]);
        sum1 += h1[i-1];
    }
        for(int i = h2.length;i>0 ; i--){
        stack2.push(h2[i-1]);
        sum2 += h2[i-1];
    }
        for(int i = h3.length;i>0 ; i--){
        stack3.push(h3[i-1]);
        sum3 += h3[i-1];
    }

        while(sum1 != sum2 || sum2!= sum3 || sum3 != sum1){
        if(sum1 > sum2 && sum1 > sum3 || sum1 == sum2 && sum1 >sum3 || sum1==sum3 && sum1 > sum2){
            sum1 -= stack1.peek();
            stack1.pop();
        }
        if(sum2 > sum1 && sum2 > sum3 || sum2 == sum3 && sum2 >sum1 || sum2==sum1 && sum2 > sum3){
            sum2 -= stack2.peek();
            stack2.pop();
        }
        if(sum3 > sum2 && sum3 > sum1 || sum3 == sum1 && sum3 >sum2 || sum3==sum2 && sum3 > sum1){
            sum3 -= stack3.peek();
            stack3.pop();
        }
    }
        System.out.println(sum1);
}
}
