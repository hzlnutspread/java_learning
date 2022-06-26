public abstract class threads {

    public static void main(String[] args) throws InterruptedException {

        //Threads =     A thread of execution in a program (like a virtual CPU)
        //              JVM allows an app to have multiple threads running concurrently
        //              Each thread executes parts of your code in parallel with the main thread.
        //              Each thread has its own priority
        //              JVM continues to execute until either of these happens:
        //                  1. Exit method of class runtime has been called
        //                  2. All user threads have died

        //              When a JVM starts up, there is a thread that calls the main method called "main"

        //              Daemon thread = low priority thread that runs in the background to perform tasks such as garbage collection
        //              JVM terminates itself when all user threads finish execution


        System.out.println(Thread.activeCount());
        Thread.currentThread().setName("MAIN");
        System.out.println((Thread.currentThread().getName()));

        Thread.currentThread().setPriority(9);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().isAlive());

//        for(int i = 3; i > 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("You are done!");

        //creating a second thread
        thread_class thread2 = new thread_class();
        thread2.setDaemon(true);
        thread2.start();
        System.out.println(thread2.isAlive());

        thread2.setName("MAIN2");
        System.out.println(thread2.getName());

        thread2.setPriority(10);
        System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());

        System.out.println(thread2.isDaemon());

    }
}