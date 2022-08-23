package neww;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinWorkerThread;

public class ThreadPool implements Runnable {

    private String command;

    public ThreadPool(String s) {
        this.command = s;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return this.command;
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i=1;i<=10;i++) {
            Runnable r1 = new ThreadPool("" +i);
            executor.execute(r1);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("Finished all Threads");
    }
}
