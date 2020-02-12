package ThreadsTest.multitasking_IN_multithreading.by_Annonymous_class;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /**
         * @Option 1
         * using normal syntax
         * create annonymous obj from Interface Runnable
         * override void run ()
         */
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                //print current thread name
                System.out.println(Thread.currentThread().getName());
            }
        };


        /**
         * @Option2
         * using lambda syntax
         * create anonymous obj from Interface Runnable
         * override void run ()
         */
        Runnable run2 = () -> {
            //print current thread name
            System.out.println(Thread.currentThread().getName());
        };


        /**
         * create two thread with given name
         */
        Thread thread1 = new Thread(run1,"[ Thread 1 ]");
        Thread thread2 = new Thread(run2,"[ Thread 2 ]");

        thread1.start();
        thread2.start();


        /**
         * join for tell main thread wait for two thread above finish
         */
        thread1.join();
        thread2.join();


        Thread.currentThread().setName("[Thread Main]");
        System.out.println(Thread.currentThread().getName());
    }
}
