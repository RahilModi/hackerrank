package com.hackerrank.linkedlist;

public class Insert {

    //insert at pos
    Node InsertNth(Node head, int data, int position) {

        Node newNode = new Node();
        newNode.next = null;
        newNode.data = data;

        if(head == null){
            return newNode;
        }else{
            Node temp = head;
            Node prev = null;
            int pos = 0;
            while(position > pos && temp != null){
                prev = temp;
                temp = temp.next;
                pos++;
            }
            if(prev == null){
                newNode.next = temp;
                head = newNode;
            }
            else{
                newNode.next = temp;
                prev.next = newNode;
            }
        }
        return head;
    }

    //insert node at head;
    //changed name of the method
    Node InsertBeginning(Node head,int x) {
        Node newHead = new Node();
        newHead.data = x;
        newHead.next = null;
        if(head == null){
            return newHead;
        }else{
            newHead.next = head;
            return newHead;
        }
    }

    //insert at end

    Node Insert(Node head,int data) {
// This is a "method-only" submission.
// You only need to complete this method.

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
}
