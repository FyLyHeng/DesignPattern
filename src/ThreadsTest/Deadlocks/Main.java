package ThreadsTest.Deadlocks;

public class Main {
    public static void main(String[] args) {
        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaisawal";

        /**
         * by lambda
         * thread with two synchronized block code
         */
        Thread thread = new Thread(() -> {

            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                try { Thread.sleep(100); } catch (Exception e) { }
            }


            synchronized (resource2){
                System.out.println("Thread 1: locked resource 2");
            }
        });


        /**
         * by simple style
         * thread with two synchronized block code
         */
        Thread thread2 = new Thread(){

            @Override
            public void run() {

                //block1
                synchronized (resource2){
                    System.out.println("Thread 2: locked resource 2");
                    try { Thread.sleep(10000); } catch (InterruptedException e) {}
                }

                //block1
                synchronized (resource1){
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        };


        thread.start();
        thread2.start();
    }
}
