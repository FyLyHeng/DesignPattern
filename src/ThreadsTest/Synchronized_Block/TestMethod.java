package ThreadsTest.Synchronized_Block;

public class TestMethod {

    final int m = 5;
    void show(int n) {

        /**
         * synchronized block code
         */
        synchronized (this) {
            for (int i = 0; i <= m; i++) {
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
