package Threads;

public class MainFirst {
    public static void main(String[] args) throws InterruptedException{

        First first = new First();

        Runnable run1 = () -> first.accessA();
        Runnable run2 = () -> first.accessB();

        Thread t1 = new Thread(run1); // call run1
        t1.start();

        Thread t2 = new Thread(run2); //call run2
        t2.start();


        t1.join();
        t2.join();
    }
}
