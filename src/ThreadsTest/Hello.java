package ThreadsTest;

public class Hello implements Runnable {

    /**
     * method in interface Runnable
     * call this method to start Thread
     */
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * we can start thread by other method
     */
    public void start(){
        for (int i=1;i<=5;i++){
            System.out.println("kok");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
