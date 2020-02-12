package ThreadsTest.GroupThreads;

public class MyRun implements Runnable {
    @Override
    public void run() {
        /**
         * print current thread name
         */
        System.out.println(Thread.currentThread().getName());
    }
}
