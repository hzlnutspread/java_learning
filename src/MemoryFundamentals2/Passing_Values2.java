package MemoryFundamentals2;

public class Passing_Values2 {
    public static void main (String[] args) {
        Passing_Values2_Class c = new Passing_Values2_Class("Sally");
        renameCustomer(c);
        System.out.println(c.getName());
    }

    public static void renameCustomer(Passing_Values2_Class cust) {
        cust.setName("Diane");
    }
}

//      At line 3, a String object ("Sally") is created in the heap
//          which is referenced by the Passing_Values2_Class object in the heap with a property that references the string object (name)
//          which is referenced by the variable c created on the stack
//
//      At line 4 we call renameCustomer, since we pass value of customer by value, a new variable is created on the stack called cust
//          cust is given a copy of the pointer that points to the Passing_Values2_Class on the heap
//
//      Because String are immutable (can't change them otherwise it creates a whole new object) a new string object is created on the heap
//          Java changes the pointer from the name in the Passing_Values2_Class object to the new string "Diane"
//
//      Old string "Sally is no longer pointed to so it can be collected by garbage collector
//
//      Exit renameCustomer method and pop cust.
//          c is now pointing to the Passing_Values2_Class object which is now pointing to the new string of "Diana"