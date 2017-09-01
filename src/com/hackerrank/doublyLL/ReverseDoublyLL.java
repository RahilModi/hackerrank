package com.hackerrank.doublyLL;

public class ReverseDoublyLL {
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

    Node Reverse(Node head)
    {
        Node temp = head;
        if(temp == null || temp.next == null){
            return head;
        }
        Node prev = null;
        while(temp.next != null){
            Node next = temp.next;
            temp.next = prev;
            temp.prev = next;
            prev = temp;
            temp = next;
        }
        temp.prev = null;
        temp.next = prev;
        head = temp;
        return head;
    }
}
