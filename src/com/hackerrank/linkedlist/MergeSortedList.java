package com.hackerrank.linkedlist;

public class MergeSortedList {
    /*
  Merge two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    Node mergeLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        Node list1 = headA;
        Node list2 = headB;
        Node newHead = null;
        Node current = null;

        while(list1 != null && list2!= null){
            if(list1.data < list2.data){
                if(newHead == null){
                    current = list1;
                    newHead = current;
                }else{
                    current.next = list1;
                    current = current.next;
                }
                list1 = list1.next;
            }else{
                if(newHead == null){
                    current = list2;
                    newHead = current;
                }else{
                    current.next = list2;
                    current = current.next;
                }
                list2 = list2.next;
            }
        }
        if(list1 != null){
            if(current == null){
                return list1;
            }
            current.next = list1;
        }else if(list2 != null){
            if(current == null){
                return list2;
            }
            current.next = list2 ;
        }
        return newHead;

    }

}
