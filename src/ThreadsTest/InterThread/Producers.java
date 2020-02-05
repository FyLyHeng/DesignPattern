package ThreadsTest.InterThread;

public class Producers implements Runnable{
    Queues queues;

    /**
     * constructor
     */
    public Producers(Queues queues){
        this.queues = queues;
        Thread thread = new Thread(this,"Producers");
        thread.start();
    }


    /**
     * local method
     */
    public void run(){
        int i=1;
        while (true){

            //call put() in Queues class by obj queues
            queues.put(i*=i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){ }
            i++;
        }
    }
}
