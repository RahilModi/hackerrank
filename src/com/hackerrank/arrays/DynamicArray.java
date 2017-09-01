package com.hackerrank.arrays;

import java.util.*;

public class DynamicArray {

    public static void main(String[] args) {
        int lastAnswer = 0;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        ArrayList<Integer>[] seqList = new ArrayList[N];

        int numOfQueries = in.nextInt();
        for(int i=0; i <numOfQueries; i++){
            int queryType = in.nextInt();
            int x,y;
            x = in.nextInt();
            y = in.nextInt();
            int pos = (x ^ lastAnswer) % N;
            if(queryType == 1){
                if(seqList[pos] == null){
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(y);
                        seqList[pos] = list;

                }else{
                        seqList[pos].add(y);
                }
            }else{
                System.out.println(lastAnswer = seqList[pos].get(y % seqList[pos].size()));
            }
        }
    }
}