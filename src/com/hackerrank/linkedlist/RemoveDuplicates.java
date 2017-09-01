package com.hackerrank.linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {
    /*
Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

    Node RemoveDuplicates(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        HashSet<Integer> set = new HashSet<Integer>();
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(!set.contains(temp.data)){
                set.add(temp.data);
                prev = temp;
            }else{
                prev.next = temp.next;
            }
            temp = temp.next;
        }
        return head;

    }
}
