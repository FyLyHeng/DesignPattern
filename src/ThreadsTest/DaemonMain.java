package ThreadsTest;

public class DaemonMain {

    public static void main(String[] args) {

        DaemonThread daemonThread =  new DaemonThread();
        Thread thread = new Thread(daemonThread);


        thread.setDaemon(true);
        if (thread.isDaemon()){
            try { thread.join(); } catch (InterruptedException e) { }
            System.out.println("invoked constructor");
            thread.start();

        }

    }
}
