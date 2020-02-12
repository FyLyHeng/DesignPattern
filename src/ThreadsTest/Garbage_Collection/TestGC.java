package ThreadsTest.Garbage_Collection;

public class TestGC {


    /**
     * override method finalize
     */
    public void finalize(){
        System.out.println("object is garbage collected");

    }

    public static void main(String[] args) {
        TestGC gc = new TestGC();
        TestGC gc1 = new TestGC();

        /**
         * before set gc,gc1 to null
         * the obj is still available
         */
        System.gc();

        gc=null;
        System.gc();
    }
}
