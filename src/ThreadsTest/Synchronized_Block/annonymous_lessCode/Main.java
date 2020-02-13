package ThreadsTest.Synchronized_Block.annonymous_lessCode;

public class Main {
    public static void main(String[] args) {

        final Test test = new Test();

        Thread thread = new Thread(() -> test.show(5));

        Thread thread1 = new Thread(()-> test.show(100));
        thread.start();
        thread1.start();
    }
}
