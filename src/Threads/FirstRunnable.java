package Threads;

public class FirstRunnable {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            System.out.println("Rinning in thread "+Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("T1");
        t.start();
        t.run();
    }


}
