package ThreadsTest.Interrupting;

public class TestInterrupting extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted..."+e);
        }
    }


    public static void main(String[] args) {
        TestInterrupting interrupting = new TestInterrupting();
        interrupting.start();

        interrupting.interrupt();
//        try {
//            interrupting.interrupt();
//        }catch (Exception e){
//            System.out.println("Exception handled "+e);
//        }
    }
}
