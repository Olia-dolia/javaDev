package com.company;

public class Main {

    public static void main(String[] args) {
        MyArrayList myArray = new MyArrayList();
        myArray.add("Red");
        myArray.add("Green");
        myArray.add("Blue");
        System.out.println(myArray.size());
        System.out.println(myArray.contains("Green"));

        System.out.println("LinkedList");
        MyLinkedList  listl = new MyLinkedList();
        listl.add("F");
        listl.add("B");
        listl.add("D");
        listl.add("E");
        listl.add("C");
        listl.add("Z");
        listl.remove("Z");
        System.out.println(listl.contains("Z"));
        System.out.println(listl.toString());

        System.out.println("Serialization");
        String path = "D:\\Java2course\\Task2\\person.txt";
        Person p = new Person("Sam", 23, 182, true);
        MySerialization.mySerialize(p,path );
        Person p2 = (Person) MySerialization.myDeserialize(path);
        System.out.println(p2);
    }
}
