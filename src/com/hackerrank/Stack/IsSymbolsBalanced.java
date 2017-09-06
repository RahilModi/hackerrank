package com.hackerrank.Stack;

import java.util.Scanner;
import java.util.Stack;

public class IsSymbolsBalanced {
    static String isBalanced(String s) {
        // Complete this function

        char [] inputSequence = s.toCharArray();
        Stack<Character> stackOfSymbols = new Stack<>();
        int i = 0;
        while(i<inputSequence.length){
            if(inputSequence[i] == ')'){
                if(stackOfSymbols.isEmpty() || stackOfSymbols.peek() != '('){
                    return "NO";
                }
                stackOfSymbols.pop();

            }
            else if(inputSequence[i] == '}'){
                if(stackOfSymbols.isEmpty() || stackOfSymbols.peek() != '{'){
                    return "NO";
                }
                stackOfSymbols.pop();
            }
            else if(inputSequence[i] == ']'){
                if(stackOfSymbols.isEmpty() || stackOfSymbols.peek() != '['){
                    return "NO";
                }
                stackOfSymbols.pop();
            }
            else{
                stackOfSymbols.push(inputSequence[i]);
            }
            i++;
        }

        if(stackOfSymbols.isEmpty()){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
