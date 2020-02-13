package ThreadsTest.Synchronized_Block;

public class Main {
    public static void main(String[] args) {

        TestMethod method = new TestMethod();


        Test01 test01 = new Test01(method);
        Test02 test02 = new Test02(method);

        test01.start();
        test02.start();


    }
}
