package com.hackerrank.Stack;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AndOrXOR {

        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            Stack<Integer> stack = new Stack<>();
            int min_xor=0,max_xor=0;

            int[] temp = new int[number];
            for(int i =0 ;i < number ;i++){
                temp[i]=in.nextInt();
            }

            for(int i =0 ;i < number ;i++){

                while(!stack.isEmpty()){
                    min_xor = temp[i]^stack.peek();
                    if(min_xor>max_xor){
                        max_xor = min_xor;
                    }
                    if(temp[i]<stack.peek()){
                        stack.pop();
                    }else{
                        break;
                    }
                }
                stack.push(temp[i]);
            }
            System.out.println(max_xor);

        }
}
