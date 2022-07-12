package MultithreadingWithJohn;

public class Multithreading {

    public static void main(String[] args) throws InterruptedException {

        // Multithreading is the ability to execute multiple different paths of code at the same time
        // First way is to extends Thread

        for (int i = 0; i < 5; i++) {
            MultithreadableThing myThing = new MultithreadableThing(i);
            myThing.start(); // to start the new thread branch
        }

        // Second way is to implement Runnable
        for (int i = 0; i < 5; i++) {
            MultithreadableThingTwo myThing2 = new MultithreadableThingTwo(i);
            Thread myThread = new Thread(myThing2);
            myThread.start();
            myThread.join(); // waits for thread to die before starting next loop thread
            myThread.isAlive(); // Is the thread still running? boolean

            // Better to implement runnable even though you have extra line of code to create new thread.
            // If you extend thread instead you can't extend anything else
            // You can implement lots of interfaces

        }
    }
}

// If any of the threads blows up, the rest are unaffected
