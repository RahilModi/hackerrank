package com.hackerrank.linkedlist;

public class Reverse {
    //prints in reverse order
    void ReversePrint(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        if(head == null){
            return;
        }else{
            Node temp = head;
            Node current = null;
            Node prev = null;
            while(temp.next != null){
                current = temp;
                temp = temp.next;
                current.next = prev;
                prev = current;
            }
            if(temp != head)
                temp.next = prev;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    //returns new head
    Node Reverse(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        if(head == null){
            return head;
        }else{
            Node temp = head;
            Node current = null;
            Node prev = null;
            while(temp.next != null){
                current = temp;
                temp = temp.next;
                current.next = prev;
                prev = current;
            }
            if(temp != head){
                temp.next = prev;
            }
            head = temp;
            return head;
        }
    }

    /*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

    int GetNode(Node head,int n) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        if(head == null){
            return 0;
        }else{
            Node temp = head;
            Node current = null;
            Node prev = null;
            while(temp.next != null){
                current = temp;
                temp = temp.next;
                current.next = prev;
                prev = current;
            }
            if(temp != head)
                temp.next = prev;
            while(n>0){
                temp = temp.next;
                n--;
            }
            return temp.data;
        }
    }
}
