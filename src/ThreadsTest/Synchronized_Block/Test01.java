package ThreadsTest.Synchronized_Block;

public class Test01 extends Thread{

    /**
     * create obj
     * dataType is Class TestMethod
     */
    TestMethod method ;


    /**
     *constructor with parameter
     * @param method1
     */
    Test01(TestMethod method1){
        this.method = method1;
    }

    @Override
    public void run() {
        method.show(5);
    }
}
