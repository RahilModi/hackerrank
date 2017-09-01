package com.hackerrank.linkedlist;

public class Compare {
    /*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not.
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    int CompareLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        Node list1 = headA;
        Node list2 = headB;
        while(list1 != null && list2!= null){
            if(list1.data == list2.data){
                list1 = list1.next;
                list2 = list2.next;
            }
            else{
                return 0;
            }
        }
        if(list1 == null && list2 == null){
            return 1;
        }
        return 0;

    }
}
