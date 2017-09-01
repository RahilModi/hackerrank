package com.hackerrank.doublyLL;

public class InsertInsortedManner {

    /*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

    Node SortedInsert(Node head,int data) {
        Node temp = head;
        Node previous = null;
        Node newNode = new Node();
        newNode.data = data;
        if(head == null){
            head = newNode;
            newNode.next = null;
            newNode.prev = null;
            return head;
        }

        while(temp != null && temp.data < data){
            previous = temp;
            temp = temp.next;
        }
        if(previous == null){
            newNode.prev = null;
            newNode.next = temp;
            temp.prev = newNode;
            head = newNode;
        }else if(temp == null){
            previous.next = newNode;
            newNode.prev = previous;
            newNode.next = null;
        }else{
            previous.next = newNode;
            newNode.prev = previous;
            newNode.next = temp;
            temp.prev = newNode;
        }
        return head;
    }
}
