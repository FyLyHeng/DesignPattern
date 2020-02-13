package ThreadsTest.Synchronization;

public class NotSynchro1 {
    synchronized void print(int n){
        for (int i=0;i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400); } catch (InterruptedException e) { }
        }
    }
}
