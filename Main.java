package com.company;

public class Main {

    public static void main(String[] args) {
	    LinkedList<Integer> linkedList = new LinkedList<Integer>();
	    linkedList.pushBack(10);
        linkedList.pushBack(120);
        linkedList.pushBack(1023);

        System.out.println("Size:" + linkedList.size());
        System.out.println(linkedList.toString());
    }
}
