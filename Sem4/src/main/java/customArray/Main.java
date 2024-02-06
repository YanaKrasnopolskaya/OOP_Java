package customArray;

import customArray.implement.MyArrayList;
import customArray.implement.MyLinkedList;

public class Main {
    public static void main(String[] args) {
//        MyArrList<Integer> myList = new MyArrayList<>();
//
//        myList.add(355);
//        myList.add(27);
//        myList.add(45);
//
//
//        System.out.println(myList);
//
//        myList.remove(1);
//
//        System.out.println(myList);

        MyLinkedList<String> linkedList = new MyLinkedList<>();

        linkedList.addLast("First");
        linkedList.addLast("Second");
        linkedList.addFirst("New First");

        System.out.println("Size: " + linkedList.size());

        System.out.println("Element at index 0: " + linkedList.get(0));
        System.out.println("Element at index 1: " + linkedList.get(1));
        System.out.println("Element at index 2: " + linkedList.get(2));
    }
}
