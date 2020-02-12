package ThreadsTest.GroupThreads;

public class Main {
    public static void main(String[] args) {

        /**
         * create obj myRun()
         */
        MyRun myRun = new MyRun();

        /**
         * create thread group with given name Group A
         */
        ThreadGroup group = new ThreadGroup("Group A");


        /**
         * create 3 simple thread
         * and set it into ThreadGroup (group)
         */
        Thread t1 = new Thread(group, myRun, "Thread 1");
        t1.start();
        Thread t2 = new Thread(group, myRun, "Thread 2");
        t2.start();
        Thread t3 = new Thread(group, myRun, "Thread 3");
        t3.start();


        System.out.println("Name :[ "+group.getName()+" ]");
        group.list();
    }
}
