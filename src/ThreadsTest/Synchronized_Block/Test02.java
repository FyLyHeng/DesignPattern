package ThreadsTest.Synchronized_Block;

public class Test02 extends Thread {

    /**
     * create obj
     * dataType is Class TestMethod
     */
    TestMethod method ;


    /**
     *constructor with parameter
     * @param method1
     */
    Test02(TestMethod method1){
        this.method = method1;
    }

    @Override
    public void run() {
        method.show(1000);
    }
}
