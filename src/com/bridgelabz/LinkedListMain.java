package com.bridgelabz;

public class LinkedListMain {


        public static void main(String[] args) {
            LinkedList<Integer> linkedList1 = new LinkedList<>();
            linkedList1.append(56);
            linkedList1.append(70);
            linkedList1.searchAndInsert(30, 56);
            linkedList1.findNode(30);
            linkedList1.findNode(100);
            linkedList1.searchAndInsert(40, 30);
            linkedList1.searchAndDelete(40);
            linkedList1.printLinkedList();
            linkedList1.size();
        }
}

