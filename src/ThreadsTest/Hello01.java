package ThreadsTest;

public class Hello01 implements Runnable {

    @Override
    public void run() {
        for (int i =1;i<=5;i++){
            try { Thread.sleep(1000); } catch (Exception e) { }
            System.out.println("Hello_01");
        }
    }
}
