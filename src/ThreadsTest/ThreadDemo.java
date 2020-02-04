package ThreadsTest;

public class ThreadDemo {
    public static void main(String[] args) {



        Hello hello = new Hello();
        Hi hi = new Hi();


        /**
         * now we can run two statement at the same time
         * now we use 2 thread
         * make the process fast
         */
        hi.start(); //run method in class Hi extant Thread
        hello.run(); // call run in class Hello implement Runnable


    }
}
