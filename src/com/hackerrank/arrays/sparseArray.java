package com.hackerrank.arrays;

import java.io.*;
import java.util.*;

public class sparseArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> stringCount = new HashMap<>();
        for(int i = 0; i < n ; i++){
            String str = in.next();
            if(stringCount.get(str) != null){
                int count = stringCount.get(str);
                stringCount.put(str,++count);
            }else{
                stringCount.put(str,1);
            }
        }
        int numQueries = in.nextInt();
        for(int i = 0; i < numQueries ; i++){
            String query = in.next();
            if(stringCount.get(query) == null){
                System.out.println(0);
            }else{
                System.out.println(stringCount.get(query));
            }
        }


        in.close();

    }
}

