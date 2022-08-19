package MemoryFundamentals2;

public class Memory_Test {

    public static void main (String[] args) {

        Memory_Test main = new Memory_Test();
        main.start();
    }

    public void start() {
        String last = "Z";
        Memory_Test_Container container = new Memory_Test_Container();
        container.setInitial("C");
        another(container,last);
        System.out.println(container.getInitial());

    }

    public void another(Memory_Test_Container initialHolder, String newInitial){

        newInitial.toLowerCase();
        initialHolder.setInitial("B");
        Memory_Test_Container initial2 = new Memory_Test_Container();
        initialHolder = initial2;

        System.out.println(initialHolder.getInitial());
        System.out.println(newInitial);
    }
}

//  Explanation of the code:
//      Memory_Test on the heap, with a reference to it called main on the stack
//      start() method, String "Z" on the heap, with a reference to it called last on the stack. (main variable is out of scope now)
//      Memory_Test_Container on the heap, reference to it called container on the stack.
//          Memory_Test_Container object will point to String "A" in the heap. This is how it is initialised.
//      setInitial will create a new String "C" object, and the container object will now point to String "C". String "A" is lost
//      another(container, last) method.
//          initialHolder is a copy of the 'container' variable, and newInitial is a copy of the 'last' variable.
//          Being passed into the method by value, so copies of last and container are being made.
//          newInitial is a copy of last, so it points to String "Z" (This is what last points to)
//          initialHolder is a copy of containter, so it points to the Memory_Test_Container object (This is what container points to)
//
//      newInitial.toLowerCase();
//          new String "z" object is created on the heap, but doesn't change the value of newInitial.
//          Not referenced by anything so its immediately up for garbage disposal. newIntiial still points to String "Z"
//
//      initialHolder.setInitial("B"):
//          String object created on the heap String "B", and when we call setInitial, the Memory_Test_Container reference now points to String "B"
//          String "C" is now lost.
//
//      Memory_Test_Container initial2 = new Memory_Test_Container();
//          initial2 is on the stack, reference points to Memory_Test_Container initial points to String "A" object since thats how its initialised
//
//      initialHolder = initial2;
//          This makes initialHolder's reference point to the same that initial2 is pointing to. Which is Memory_Test_Container which points to String "A"
//
//      sout(initialHOlder.getInitial()); --> This should give "A"
//      sout(newInitial); --> This should give "Z"
//      sout(container.getInitial()); --> This should give "B"
