package ThreadsTest.Synchronized_Block.Static_Synchronization.annonymous_class;

public class Main {
    public static void main(String[] args) {


        Thread thread1 = new Thread(() -> Testz16.out(1));


        Thread thread2 = new Thread(() -> Testz16.out(10));

        System.out.println(thread1.isAlive());
    }

}
