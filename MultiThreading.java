// Execute multiple threads concurrently

public class MultiThreading {
    public static void main(String[] args) {
        // MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread thread1 = new Thread(new MyRunnable2("Ping"));
        Thread thread2 = new Thread(new MyRunnable2("Pong"));

        System.out.println("Game Starts");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();     // Makes the main thread wait til these threads are done
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("Main thread interrupted");
        }

        System.out.println("Game Over");
    }
}
