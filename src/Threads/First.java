package Threads;

public class First {
    private final Object key1 = new Object();
    private final Object key2 = new Object();

    public void accessA() {
        synchronized (key1) {
            System.out.println("["+Thread.currentThread().getName() + "] accessA()");
            accessB(); // call B into A
        }
    }

    synchronized void accessd() {
            System.out.println("["+Thread.currentThread().getName() + "] accessA()");
            accessB(); // call B into A
    }

    public void accessB() {
        System.out.println("["+Thread.currentThread().getName() + "] accessB()");
//        synchronized (key2) {
//            System.out.println("["+Thread.currentThread().getName() + "] accessB()");
//            accessC();// we call C in to B
//        }
    }

    public void accessC() {
        synchronized (key1) {
            System.out.println("["+Thread.currentThread().getName() + "] accessC()");
        }
    }


    public void out(){
        System.out.println(key1 +"    "+ key2);
    }

    }
