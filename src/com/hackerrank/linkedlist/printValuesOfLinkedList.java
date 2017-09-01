package com.hackerrank.linkedlist;

public class printValuesOfLinkedList{
        void Print(Node head)
        {
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
}
