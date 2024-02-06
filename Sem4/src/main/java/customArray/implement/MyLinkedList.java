package customArray.implement;

import customArray.MyLinList;
import customArray.Node;

public class MyLinkedList<T> implements MyLinList<T>{
    Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public void addFirst(T elem) {
        Node<T> newNode = new Node<>(elem);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T elem) {

        Node<T> newNode = new Node<>(elem);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    private boolean isEmpty() {
        return size == 0;
    }

}
