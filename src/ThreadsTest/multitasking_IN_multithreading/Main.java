package ThreadsTest.multitasking_IN_multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        Thread thread1 = new Thread(task1,"[Thread 1]");
        Thread thread2 = new Thread(task2,"[Thread 2]");

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        Thread.currentThread().setName("Thread Main");
        System.out.println("["+Thread.currentThread().getName()+"]");

    }
}
