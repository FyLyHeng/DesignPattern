package ThreadsTest.PoolThread;

public class PoolThreads implements Runnable {

    private String message;

    public PoolThreads(String message){
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        sleeps();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }

    //local method
    private void sleeps(){
        try { Thread.sleep(5000); } catch (InterruptedException e) { }
    }
}
