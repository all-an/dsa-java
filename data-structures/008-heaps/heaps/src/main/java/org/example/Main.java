package org.example;

public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap(5);
        myHeap.insert(42);
        System.out.println(myHeap.getParent(0));
    }
}