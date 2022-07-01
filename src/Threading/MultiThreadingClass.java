package Threading;

public class MultiThreadingClass extends Thread {

    @Override
    public void run() {

        for (int i = 10; i > 0; i--) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(1/0);
            // even if we have an error in this thread the other thread will keep going
        }
        System.out.println("Thread 1 has finished counting down!");
    }
}
