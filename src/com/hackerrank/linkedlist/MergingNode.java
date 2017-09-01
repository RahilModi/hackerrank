package com.hackerrank.linkedlist;

public class MergingNode {
    /*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    int FindMergeNode(Node headA, Node headB) {
        // Complete this function
        // Do not write the main method.

        int lengthList1 = 0;
        int lengthList2 = 0;
        Node temp1 = headA;
        Node temp2 = headB;
        //calculating length of list1
        while (temp1 != null) {
            lengthList1++;
            temp1 = temp1.next;
        }
        //calculating length of list2
        while (temp2 != null) {
            lengthList2++;
            temp2 = temp2.next;
        }
        int diff = 0;
        //calculating difference in length
        if (lengthList1 > lengthList2) {
            temp1 = headA;
            temp2 = headB;
            diff = lengthList1 - lengthList2;
        } else {
            temp1 = headB;
            temp2 = headA;
            diff = lengthList2 - lengthList1;
        }
        //incrementing the head to difference times of larger list
        for (int i = 0; i < diff; i++) {
            temp1 = temp1.next;
        }
        //comparing one node from each list once match returning the node..
        while (temp1 != null && temp2 != null) {

            if (temp1 == temp2) {
                return temp1.data;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return 0;
    }

}
