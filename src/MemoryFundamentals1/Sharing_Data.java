package MemoryFundamentals1;

import java.util.ArrayList;
import java.util.List;

public class Sharing_Data {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        printList(myList);

    }

    public static void printList(List<String> data) {
        System.out.println(data);
    }
}

//      In the main method, we create a myList object as a list of String objects
//          When myList object is created, there will be a reference/pointer to the object created on the stack, but the object itself will be created on the heap
//          The myList variable created on the stack will contain the memory address of the part of the heap that contains the list object

//      Rules:
//          - Objects stored physically on the heap
//          - Variable holding the object is just a reference to the object. If it is a local variable, will be stored on the stack
//          - Primitives are entirely local variables, and there are no objects for them to reference so they are always on the stack

//      The code above will run as follows:
//          - args added to stack & Heap is a massive amount of storage space compared to the stack
//          - Line 8 creates object mylist. "new" keyword means find free space on the heap large enough to store this object. We reference this object from the local variable called myList.
//              - myList (in the stack) points to the List object in the heap.
//              - myList pointer contains the memory address of where in the heap the List object is found
//          - Line 9 adds a string to the list
//              - String is an object so will need to be created. Can be thought of as adding a new String with a value of "one"
//              - In other words: myList.add(new String("one")); which uses the "new" keyword again. Same as before.
//              - Java creates an object on the heap of type String, with a value of "one"
//              - This object will be referenced from within our List object, by calling the add() method we add the reference to the String object to our List object.
//              - Nothing created on the stack. Can only access the string through the list object.
//          - Lines 10 and 11 do the same things.
//          - As we reach line 12, we enter the method "printList" on line 16.
//              - The stack will create a new local variable called data (copy of myList variable) which points to the same List object on the heap
//              - The myList variable is now out of scope
//
//
//
