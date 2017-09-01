package com.hackerrank.linkedlist;

public class Delete {
    //problem delete a node
    Node Delete(Node head, int position) {
        // Complete this method
        if(head == null){
            return head;
        }
        Node temp = head;
        Node prev = null;
        int pos = 0;

        while(position > pos && temp != null){
            prev = temp;
            temp = temp.next;
            pos++;
        }
        if(prev == null){
            head = temp.next;
        }else{
            prev.next = temp.next;
        }
        temp.next = null;
        return head;
    }
}
