package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void pop(){                        // delete first element UC5
        if(head != null){
            Node ptr = head;
            head = head.next;
            System.gc();
        }
        this.printLinkedList();
    }

    public void popLast(){
        Node ptr = head;
        Node prev = head;
        while(ptr.next != null){
           prev = ptr;
           ptr = ptr.next;
        }
        if(ptr != prev){
            prev.next = null;
            tail = prev;
        } else{
            tail = null;
            head = null;
        }
        printLinkedList();
    }


    public void findNode(T serach){
        Node ptr = head;
        while(ptr!=null){
            if(ptr.key == serach){
                System.out.println("Element" + serach + " is present in linked list");
                return;
            }
            ptr = ptr.next;
        }

        System.out.println("Element" + serach + " is not present in linked list");
    }

    public void searchAndInsert(T key, T search){      // search and insert  UC4
        Node ptr = head;
        Node<T> newNode = new Node(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            while (ptr.key != search && ptr.next != null){
                ptr = ptr.next;
            }
            newNode.next = ptr.next;
            ptr.next = newNode;
        }
        printLinkedList();
    }


    public void append(T key){                       // appending  UC3
        Node ptr = head;
        Node<T> newNode = new Node(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        this.printLinkedList();
    }


    public void prePend(T key) {                   // prepending    UC2
        Node<T> newNode = new Node(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        this.printLinkedList();
    }


    public void printLinkedList(){              // UC1
        System.out.println("Linked list after operation is");
        Node ptr = head;   // ptr = pointer

        while(ptr != null){
            System.out.print(ptr.key + " ");
            ptr = ptr.next;
        }

        System.out.println("");
    }
}
