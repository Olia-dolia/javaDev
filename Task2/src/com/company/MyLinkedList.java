package com.company;

public class MyLinkedList<T> {

    private Node first;
    private int size;

    public MyLinkedList() {
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(T data) {
        Node current = first;

        if (current == null) {
            first = new Node(data);
            size++;
            return;
        }

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Node(data));
        size++;
    }

    public void add(T[] array) {
        for (T data : array) {
            add(data);
        }
    }

    public void remove(T data) {
        Node current = first;
        Node next = current.getNext();

        if (first.getData().equals(data)) {
            if (size == 1) {
                first.setData(null);
                size--;
                return;
            }
            first.setData(null);
            first = first.getNext();
            size--;
            return;
        }

        while (next != null) {
            if (next.getData().equals(data)) {
                current.setNext(next.getNext());
                next = null;
                size--;
                return;
            }
            current = next;
            next = current.getNext();
        }
    }

    public boolean contains(T o) {
        Node<T> p;
        for(p=first;p!=null;p=p._next){
            if(p.data.equals(o)){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        if(size == 0) { //list is empty
            return "";
        }
        Node current = first;
        while (current.next != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print(current.data + "\n");
        return "";
    }

    private class Node<T> {

        private T data;
        private Node next;

        public Node(T data) {
            data = data;
            next = null;
        }

        public void setData(T data) {
            data = data;
        }

        public T getData() {
            return data;
        }

        public void setNext(Node next) {
            next = next;
        }

        public Node getNext() {
            return next;
        }

    }

}
