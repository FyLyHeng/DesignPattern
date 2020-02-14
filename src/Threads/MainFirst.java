package Threads;

public class MainFirst {
    public static void main(String[] args) throws InterruptedException{

        First first = new First();


        /**
         * @By lambda syntax
         * amomanus create obj
         * and call method AccessA ,B
         * This two statement work the same
         */
        Runnable run1 = first::accessA;
        Runnable run2 = () -> first.accessB();

        Thread t1 = new Thread(run1); // call run1
        t1.start();

        Thread t2 = new Thread(run2); //call run2
        t2.start();


        /**
         * to tell mainThread wait till other thread finnish
         * other = t1,t2
         */
        t1.join();
        t2.join();
    }
}
