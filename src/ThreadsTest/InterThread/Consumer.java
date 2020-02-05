package ThreadsTest.InterThread;

public class Consumer implements Runnable{
    Queues queues;


    /**
     * constructor with parameter
     * @param queues is A class
     */
    public Consumer(Queues queues){
        this.queues = queues;

        //create A thread and set new name "Consumer"
        Thread thread = new Thread(this,"Consumer");
        thread.start();
    }

    public void run(){
        while (true){

            //call get() from Queses Class (local)
            queues.get();

            try { Thread.sleep(1000); }catch (InterruptedException e){}
        }
    }
}
