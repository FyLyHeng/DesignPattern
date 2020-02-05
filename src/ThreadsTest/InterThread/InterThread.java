package ThreadsTest.InterThread;

public class InterThread {

    public static void main(String[] args) {

        Queues queues = new Queues();
        new Producers(queues);
        new Consumer(queues);
    }
}
