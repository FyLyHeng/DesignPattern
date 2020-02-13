package ThreadsTest.Synchronized_Block.Static_Synchronization;

public class Testz12 extends Thread{
    @Override
    public void run() {

        /**
         * call static method
         * declare with synchronized
         */
        Testz11.out(1);
    }
}
