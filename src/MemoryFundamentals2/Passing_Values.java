package MemoryFundamentals2;

public class Passing_Values {

    public static void main (String[] args) {
        int localValue = 5;
        calculate(localValue);

        System.out.println(localValue);

    }

    public static void calculate(int calcValue) {
        calcValue = calcValue*100;
    }
}

//      When you pass a value into a method, you are always passing a copy of the value.
//          Just before calculate() method is called, 'localValue = 5' is on the stack
//          When we call the method, the variable 'calcValue = 5' will be created on the stack. Its a copy.
//          If we change the value of calcValue, it won't effect the value of localValue.
//          At line 12, calcValue is now 500, localValue is still 5.
//          When we return to main method, the calcValue is popped off, and we are left with localValue = 5
//          So we should expect sout to print 5 and not 500.
//
//      Passing variables into variable is done by making a copy of the variable. Known by passing the variables by value
//
//      For object passed into methods, the reference to the object is passed by value
