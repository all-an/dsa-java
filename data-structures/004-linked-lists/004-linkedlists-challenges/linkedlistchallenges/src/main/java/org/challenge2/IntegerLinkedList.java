package org.challenge2;

import java.util.ArrayList;
import java.util.List;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        // add your code here
        if(this.head == null){
            addToFront(value);
        }
        if(this.head != null && value < this.head.getValue()){
            addToFront(value);
        }
        if(this.head != null && value > this.head.getValue()){
            removeFromFrontAndAddTillSort(value);
        }

    }

    public void removeFromFrontAndAddTillSort(Integer newValue){
        List<IntegerNode> listRemoved = new ArrayList<>();
        IntegerNode current = head;
        while (current != null && current.getValue() < newValue) {
            listRemoved.add(current);
            current = current.getNext();
            removeFromFront();
        }
        addToFront(newValue);
        for (int i = listRemoved.size() - 1; i >= 0; i--){
            addToFront(listRemoved.get(i).getValue());
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
