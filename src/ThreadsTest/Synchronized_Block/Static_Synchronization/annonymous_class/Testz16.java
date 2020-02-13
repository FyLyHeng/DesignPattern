package ThreadsTest.Synchronized_Block.Static_Synchronization.annonymous_class;

public class Testz16 {
    synchronized static void out(int x){
        for (int i=1;i<=10;i++){
            System.out.println(x*i);

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
