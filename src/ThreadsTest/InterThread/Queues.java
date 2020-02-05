package ThreadsTest.InterThread;

public class Queues {
    int num;
    boolean check = true;


    public synchronized void put(int num){

        while (!check){

            try { wait(); } catch (InterruptedException e) { }

        }
        check = false;
        this.num = num;
        System.out.println("PUT : "+num);
        notify();
    }

    public synchronized void get(){

        while (check){
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        check = true;
        System.out.println("GET : "+num);
        notify();
    }
}
