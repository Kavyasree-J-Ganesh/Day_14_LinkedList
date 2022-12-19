package com.bridgelabz;

public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;
    public void prePend(T key) {
        Node<T> newNode = new Node(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        printLinkedList();
    }


    public void printLinkedList(){
        System.out.println("Linked list after operation is");
        Node ptr = head;

        while(ptr != null){
            System.out.print(ptr.key + " ");
            ptr = ptr.next;
        }
    }
}
