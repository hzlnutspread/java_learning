package Threading;

public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {

                                                                            //Multithreading =  Process of executing multiple Threading.threads simultaneously.
                                                                            //                  Helps maximum utilization of CPU
                                                                            //                  Threads are independent, they dont affect execution of other Threading.threads
                                                                            //                  An exception in one thread will not interrupt other Threading.threads.
                                                                            //                  Useful in serving multiple clients, multiplayer games, and other mutually independent tasks

        MultiThreadingClass thread1 = new MultiThreadingClass();

        MultiThreadingRunnable runnable1 = new MultiThreadingRunnable();    // Second way to create a thread
        Thread thread2 = new Thread(runnable1);                             // Use subclass that implements runnable interface. Create instance of it. Pass it as argument to the Thread class
                                                                            // People usually use this method since you can still extend whereas with the first method you can't have more than one parent

        //thread1.setDaemon(true);
        //thread2.setDaemon(true);                                          //We wont get count down the whole thing will stop since thread1 and 2 are daemon. No more user Threading.threads to main terminated

        thread1.start();
        //thread1.join(1000);                           //This will wait for thread1 to die before thread2 will begin.
                                                        //Putting 1000ms in the join will mean thread2 will start 1000ms after thread1 starts instead of waiting for thread1 to die completely
                                                        //It pauses the MAIN THREAD for 1000ms
        thread2.start();

        System.out.println(1/0); //Only the main thread will fuck up, the rest will keep going

    }
}

// Two ways of creating Threading.threads
//  1. Create a subclass of a thread
//  2. Implement runnable interface and pass instance as an argument to Thread constructor