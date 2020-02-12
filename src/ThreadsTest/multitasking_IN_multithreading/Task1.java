package ThreadsTest.multitasking_IN_multithreading;

public class Task1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
