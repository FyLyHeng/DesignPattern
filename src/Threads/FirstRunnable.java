package Threads;

public class FirstRunnable {
    public static void main(String[] args) {


        /**
         * @by lambda syntax
         * anonymous class create obj
         * @class Interface Runnable
         */
        Runnable runnable = () ->{
            System.out.println("Running in thread "+Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("T1");
        t.start();
        t.run();//it run the current thread is main thread
    }


}
