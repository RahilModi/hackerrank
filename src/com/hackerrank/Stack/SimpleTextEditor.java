package com.hackerrank.Stack;

import java.io.*;
import java.util.*;

public class SimpleTextEditor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        Stack<String> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str ="";
        stack.push(str);
        for(int i = 0;i<n;i++){
            int queryType = in.nextInt();

            if(queryType == 1){
                str += in.next();
                stack.push(str);
            }else if(queryType == 2){
                int pos = in.nextInt();
                str=str.substring(0,str.length()-pos);
                stack.push(str);
            }else if(queryType == 3){
                int pos = in.nextInt();
                System.out.println(str.charAt(pos-1));
            }else if(queryType == 4){
                stack.pop();
                str = stack.peek();
            }
        }
    }
}