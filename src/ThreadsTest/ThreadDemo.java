package ThreadsTest;

public class ThreadDemo {
    public static void main(String[] args) throws Exception {



        Hello01 hello01 = new Hello01();
        Hello hello = new Hello();
        Hi hi = new Hi();

        /**
         * now we can run two statement at the same time
         * now we use 2 thread
         * make the process fast
         */


        /**
         * start() is a method in Thread class
         * use to invoke run() in Hi Class
         */
        hi.start();


        /**
         * call start() from Hello class that don't override other method
         * call own method that not relate to other Thread, Runnable
         * it difference from hi.start()
         * @Noted is not call run like hi.start()
         */
        hello.start();


        /**
         * call run() method in Hello class
         * that run is override from Runnable Interface
         * if we want call run we can call like this
         */
        //hello.run();


        /**
         * other way to invoked run()
         * by create obj of Thread class
         * tow thread work at the same time
         * @Thread_Priority to set new thread name "ERROR"
         */
        Thread t = new Thread(hello,"ERROR");
        Thread t1 = new Thread(hello01);
        t.start();
        t1.start();


        /**
         * @Thread_Priority
         * each thread have tis name
         * we can set new thread name
         * setName() to set new thread name
         */
        System.out.println(t.getName());
        t.setName("[Thread_error]");
        t1.setName("[Thread_run]");
        System.out.println(t.getName());
        System.out.println(t1.getName());


        //we can set new name to main thread
        Thread.currentThread().setName("[Main Thread]");
        System.out.println("this thread is  "+Thread.currentThread().getName());


        /**
         * isAlive() check thread alive or not
         * if we want to do s.th in mean thread while other thread work on it
         * main thread will execute first thread in it
         *
         */

        System.out.println(t.isAlive());


        /**
         * join() it allow main thread wait for child finish
         * join() mean join job in other thread in to main and kill those thread
         * before execute mean thread
         */

        t.join();
        t1.join();
        System.out.println(t.isAlive());
        System.out.println("this is mean");



    }
}
