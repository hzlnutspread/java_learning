package ArrayListVs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        // Reason these are so similar is because they both part of the collections framework
        // They implement the List interface so both support the same List methods

        // Actually is a doubly linked list. Each node has a reference to both the next and previous nodes
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        // Has to traverse the List to find the value. Slowly than ArrayList 0(n) linear time.
        System.out.println(namesLinkedList.get(2));
        // Traverse List and insert value and change references. 0(n) linear time
        namesLinkedList.add(1, "Jerry");

        // Arrays have fixed length. The ArrayList resizes the array for us behind the scenes
        String[] names = new String[3]; // Fixed length cant go over the total amount
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        // Uses Array to store values. Fast random access 0(1) constant time.
        System.out.println(namesArrayList.get(2));
        // Has to create a whole new array and then copy values 0(n)
        namesArrayList.add(1, "Jerry");

        // Adding/removing faster in Linked list
        // Indexing/searching faster in ArrayList
    }
}