package com.company;


public class LinkedList<T> {

    // Fields
    private int size;
    private Node<T> first;
    private Node<T> last;

    // Getters
    public Node<T> getFirst()
    {
        return first;
    }
    public Node<T> getLast()
    {
        return last;
    }
    public int size()
    {
        return size;
    }
    // Methods
    public void pushFront(T element) {
        if(size == 0) {
            Node<T> newNode = new Node<T>(element, null, null);
            first = newNode;
            last = newNode;
        }
        else {
            Node<T> tmp = first;
            first = new Node<T>(element, null, first);
            tmp.setPrev(first);
        }
        size++;
    }
    public void pushBack(T element) {
        Node<T> newNode = new Node<T>(element, last, null);
        if(size == 0) {
            first = newNode;
            last = newNode;
        }
        else {
            Node<T> tmp = last;
            last = new Node<T>(element, last, null);
            tmp.setNext(last);
        }
        size++;
    }
    public void pushAfter(Node<T> node, T value) throws RuntimeException {
        if(node == null)
            throw new RuntimeException("Passed node is null");
        else
            node.setNext(new Node<T>(value, node, null));
        size++;
    }
    public void pushBefore(Node<T> node, T value) throws RuntimeException {
        if(node == null)
            throw new RuntimeException("Passed node is null");
        else
            node.setPrev(new Node<T>(value, null, node));
        size++;
    }
    public void remove(T value)
    {
        for(Node<T> start = first; start != null; start = start.getNext()) {
            if(start.getValue().equals(value)) {
                Node<T> next = start.getNext();
                Node<T> prev = start.getPrev();
                if(next != null)
                    next.setPrev(prev);
                if(prev != null)
                    prev.setNext(next);
                start.removeLinks();
            }
        }
        size--;
    }
    public Node<T> getNode(int index) throws RuntimeException
    {
        if(index < 0 || index >= size)
            throw new RuntimeException("Invalid index");
        if(index > size / 2) {
            Node<T> start = last;
            for(int i = size - 1; i > index; i--)
                start = start.getPrev();
            return start;
        }
        Node<T> start = first;
        for(int i = 0; i < index; i++)
            start = start.getNext();
        return start;
    }
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder("[");
        for(Node<T> start = first; start != null; start = start.getNext()) {
            stringBuilder.append(start.getValue().toString()).append(start.getNext() != null ? ", " : "]");
        }
        return stringBuilder.toString();
    }
}

