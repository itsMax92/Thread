package neww;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ ": Hello All");
    }

    public static void main(String[] args) {

        RunnableDemo r1 = new RunnableDemo();
        RunnableDemo r2 = new RunnableDemo();
        RunnableDemo r3 = new RunnableDemo();
        RunnableDemo r4 = new RunnableDemo();
        RunnableDemo r5 = new RunnableDemo();

        Thread t1 = new Thread(r1, "Thread 1");
        Thread t2 = new Thread(r2, "Thread 2");
        Thread t3 = new Thread(r3, "Thread 3");
        Thread t4 = new Thread(r4, "Thread 4");
        Thread t5 = new Thread(r5, "Thread 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
