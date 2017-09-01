package com.hackerrank.linkedlist;

public class CycleDetection {
/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/

    boolean hasCycle(Node head) {

        Node slwPtr = head;
        Node fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slwPtr = slwPtr.next;
            if(fastPtr == slwPtr){
                return true;
            }
        }
        return false;

    }


}
