package ThreadsTest.Synchronized_Block.Static_Synchronization;

public class Testz11 {

    synchronized static void out(int a){

        for (int i=1;i<=10;i++){

            System.out.println(a*i);

            try { Thread.sleep(400); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
