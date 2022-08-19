package MemoryFundamentals2;

public class Final_Keyword {
    public static void main (String[] args) {

        final Passing_Values2_Class c = new Passing_Values2_Class("John");

        // is this method call safe?
        System.out.println(c.getName());
        System.out.println(c.getName());

    }

//    These variables can only be assigned once. Can't be altered. Similar to const in JavaScript.
//    Can change from uninitialised to having a value though.

//    For example, final Customer c = new Customer("John");
//      final c variable on the stack points to Customer name in the heap which points to the String value John in the heap.
//      Although we can't change where final c variable points to, we can change which String object the Customer name points to.
//      c.setName("Susan");.
//      So Customer name points to "Susan" and "John" is now not pointed to and is garbage collected.

//    Remember, when we use Final, its only the reference (pointer of the variable) to the object that can't be changed

}
