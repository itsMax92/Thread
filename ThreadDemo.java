package neww;

public class ThreadDemo extends Thread {


    ThreadDemo()
    {

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ ": Hello All");
    }

    public static void main(String[] args) {

        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        ThreadDemo t3 = new ThreadDemo();
        ThreadDemo t4 = new ThreadDemo();
        ThreadDemo t5 = new ThreadDemo();

        Thread tt1 = new Thread(t1, "Thread 1");
        Thread tt2 = new Thread(t2, "Thread 2");
        Thread tt3 = new Thread(t3, "Thread 3");
        Thread tt4 = new Thread(t4, "Thread 4");
        Thread tt5 = new Thread(t5, "Thread 5");

        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();
        tt5.start();

    }
}
