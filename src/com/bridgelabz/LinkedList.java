package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void append(T key){         // appending  UC3
        Node ptr = head;
        Node<T> newNode = new Node(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        printLinkedList();
    }

    public void prePend(T key) {         // prepending    UC2
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
        Node ptr = head;   // ptr = pointer

        while(ptr != null){
            System.out.print(ptr.key + " ");
            ptr = ptr.next;
        }
    }
}
