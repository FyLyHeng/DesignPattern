package ThreadsTest.Synchronized_Block.Static_Synchronization;

public class Main {
    public static void main(String[] args) {

        Testz12 testz12 = new Testz12();
        Testz13 testz13 = new Testz13();
        Testz14 testz14 = new Testz14();
        Testz15 testz15 = new Testz15();


        testz12.start();
        testz13.start();
        testz14.start();
        testz15.start();

    }
}
