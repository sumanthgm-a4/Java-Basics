public class MyRunnable2 implements  Runnable{

    private final String text;

    public MyRunnable2(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                // System.out.println(Thread.currentThread().getName() + ", " + i);
                System.out.println(this.text);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                // e.printStackTrace();
                System.out.println("Thread is interrupted");
            }
        }
    }
}
