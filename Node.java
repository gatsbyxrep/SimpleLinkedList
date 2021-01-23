package com.company;

public class Node<T> {

    // Fields
    private T value;
    private Node<T> prev;
    private Node<T> next;
    public Node() {}

    // Constructors
    public Node(T value)
    {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
    public Node(T value, Node<T> prev, Node<T> next)
    {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
    // Setters
    public void setValue(T value)
    {
        this.value = value;
    }
    public void setPrev(Node<T> prev)
    {
        this.prev = prev;
    }
    public void setNext(Node<T> next)
    {
        this.next = next;
    }
    // Getters
    public T getValue() {
        return value;
    }
    public Node<T> getPrev()
    {
        return prev;
    }
    public Node<T> getNext()
    {
        return next;
    }
    // Methods
    public void removeLinks()
    {
        this.prev = null;
        this.next = null;
    }
}
