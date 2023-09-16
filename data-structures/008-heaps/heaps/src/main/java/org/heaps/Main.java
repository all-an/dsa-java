package org.heaps;

public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap(5);
        myHeap.insert(42);
        System.out.println(myHeap.getParent(0));

        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();

        System.out.println("peek: " + heap.peek());

        heap.delete(0);
        heap.printHeap();

        myHeap.delete(0);
        //myHeap.delete(1); // IndexOutOfBoundsException: Heap is empty

        System.out.println("peek: " + heap.peek());
    }
}