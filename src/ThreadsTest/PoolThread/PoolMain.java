package ThreadsTest.PoolThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);// create 5 threads

        for (int i = 1;i<=10;i++){
            /**
             * do loop for create and excite 5 thread the same time
             * create obj runnable from class PoolThreads(local class)
             * pass value to constructor
             */
            Runnable runnable = new PoolThreads(""+i);

            /**
             * invoked method run()
             */
            executorService.execute(runnable);
        }
        /**
         * to kill all pool thread
         */
        executorService.shutdown();

        while (!executorService.isTerminated()){ }
        System.out.println("Finish");
    }
}
