package ThreadsTest.synchronized_method_annonymous;

public class Test {

    /**
     * local method with synchronized mortifi
     * @param n
     */
    synchronized void show(int n) {

        for (int i = 0; i <= 5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
