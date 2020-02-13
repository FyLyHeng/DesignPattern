package ThreadsTest.Synchronized_Block.annonymous_lessCode;

public class Test {
    final int m = 5;

    void show(int n)  {


        synchronized (this){

            for (int i=0;i<=m;i++){
                System.out.println(n*i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
