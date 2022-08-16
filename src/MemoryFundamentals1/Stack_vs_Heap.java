package MemoryFundamentals1;

public class Stack_vs_Heap {
    public static void main(String[] args) {

        int value = 7;
        value = calculate(value);

    }
    public static int calculate(int data) {
        int tempValue = data + 3;
        int newValue = tempValue * 2;
        return newValue;
    }
}

//          Java Memory is split into two things:
//              The stack/scoping:
//                  Every thread in a Java application has its own stack
//                  Java knows exactly when data on the stack can be destroyed
//                  Add data to stack by pushing it to the top. First in, last out.
//                  Pop/pull data from the top of the stack.
//                  Every time you call a function, java pushes the local variables for the function onto the stack.
//                      E.g. the code above will run as follows:
//                          - args = empty array will go to top of stack
//                          - value = 7 gets pushed to the top of the stack
//                          - As we enter the calculate method, a new variable is added to the stack. A copy of the value variable called data = 7.
//                              - The args and value variables are now out of scope for the current calculate method
//                          - tempValue = 10 is added to stack
//                          - newValue = 20 is added to the stack
//                  When the method returns, all data added to stack from the method is now popped. Stack is now the same as it was before the method call.
//                  Now back in the main method, tells java to assign value to what was returned from the method. So value changed to value = 20.
//                  Final closing bracket, thread completed, now stack is empty.
//                  Closing bracket means any local variable declared inside the block you're leaving is popped and destroyed.

//              Java maintains very tight scoping rules for stacks. We want local variables to have a short lifetime.

//              The Heap:
//                  Allows us to store data that has a longer lifetime than a single code-block or function.
//                  E.g. objects shared across multiple methods
//                  Its a huge area for storing data. All memory of application except for the data on the stacks.
//                  There is just one Heap for all threads, but multiple stacks, one for each thread.
//                  Placing objects on the heap makes them easy to pass around and be accessed.
//                  ALL OBEJCTS ARE STORED ON THE HEAP.
//                      - Stack used for local primitive variables like ints and doubles
//                      - All objects like strings, customers or integer objects stored on the heap
//                  For objects on the heap, there is a pointer to the object, which is the variable reference stored on the stack.
//                      - int age = 21; and String name = "hello";.
//                      - age = 21 will be stored on the stack (primitive, local variable.
//                      - String = "Hello" is an object and is stored in the heap. However, the variable name "name" is stored on the stack which points to the object in the heap.

