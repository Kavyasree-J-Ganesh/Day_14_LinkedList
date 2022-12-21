package com.bridgelabz;

public class LinkedListMain {


        public static void main(String[] args) {
            LinkedList<Integer> linkedList1 = new LinkedList<>();
            linkedList1.append(56);                            // UC3
            linkedList1.append(70);                            // UC3
            linkedList1.searchAndInsert(30, 56);    // UC4
            linkedList1.findNode(30);                   // UC7
            linkedList1.findNode(100);                  // UC7
            linkedList1.searchAndInsert(40, 30);   // UC8
            linkedList1.searchAndDelete(40);                  // UC9
            linkedList1.printLinkedList();
            linkedList1.size();                               // UC9
        }
}

