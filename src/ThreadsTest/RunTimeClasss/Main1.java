package ThreadsTest.RunTimeClasss;

import java.io.IOException;

public class Main1 {
    public static void main(String[] args) {
        //Runtime.getRuntime().exec("Terminal");


        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());


        for (double i = 0; i < 900000000; i++) {
            new Main1();
        }

        System.out.println("After Create 10000 instance, Free Memory: " + runtime.freeMemory());

        /**
         *cg() is clean obj that no longer for use
         * pervade free space memory
         */
        System.gc();
        System.out.println("After gc(), Free Memory: " + runtime.freeMemory());
    }
}
