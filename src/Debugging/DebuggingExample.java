package Debugging;

public class DebuggingExample {

    public static void main(String[] args) {
        int firstInt = 7;
        int secondInt = 8;

        int sum = add(firstInt, secondInt);
        System.out.println("The sum is: " + sum);
    }

    public static int add(int int1, int int2) {
        int sum = int1 + int2;
        return sum;
    }
}

// Break point = spot that you mark in your code
// When code reaches that spot it stops and allows you to see the state of your code
// For example, put a mark at line 5 and run it
// Will show you the variable view and which variables are available at the scope of line 5.
// Will show you firstInt and its value (7). Will also show the args value which is passed into every main method
// Very useful to see every variable available to you at any time

// Will also see the thread that is running, can se the class and the method name and the line its paused on
// It executes everything UP TO line 5 but hasn't executed line 5, so we don't see secondInt.

// To proceed to the next line of code, click the "Step over" button, and it will update and go to line 7

// If the line of code that you're on has a method call in it, you can press "step into" to get into the first line of the method being called
// Only int1 and int2 will be seen. firstInt and secondInt won't be available

// When you jump inside a method call, it gets added to the debugging stack

// Resume button will continue execution of code until it hits another breakpoint

// Debug tools also allow you to change variables values

// If you have an array, it will show you the contents of each index of the array

// Can also see the ID of a variable to see if some things are representing the same object in memory
