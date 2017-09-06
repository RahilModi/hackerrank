package com.hackerrank.Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class GetMaximumElement {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Stack<Integer> stackOfIntegers = new Stack<>();
        Stack<Integer> stackOfMax = new Stack<>();
        stackOfMax.push(Integer.MIN_VALUE);

        int numOfQueries = in.nextInt();
        for(int i=0; i <numOfQueries; i++){
            int QueryType = in.nextInt();
            if(QueryType == 1){
                stackOfIntegers.push(in.nextInt());
                if(stackOfMax.peek() <= stackOfIntegers.peek()){
                    stackOfMax.push(stackOfIntegers.peek());
                }
            }
            else if(QueryType == 2){
                if(stackOfIntegers.peek() == stackOfMax.peek()) {
                    stackOfMax.pop();
                }
                stackOfIntegers.pop();
            }
            else {
                System.out.println(stackOfMax.peek());
            }
        }
        in.close();
    }
}
