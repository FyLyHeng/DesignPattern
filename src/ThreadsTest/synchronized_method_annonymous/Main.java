package ThreadsTest.synchronized_method_annonymous;


public class Main {
    public static void main(String[] args) {
        final Test test = new Test();

        /**
         * thes tow style work the same
         * full way
         * override run method
         * call show()
         */
        Thread thread =new Thread(){
            @Override
            public void run() {
             test.show(5);
            }
        };

        /**
         * shot way by lambda syntax
         */
        Thread thread1 = new Thread(() -> test.show(100));


        thread.start();
        thread1.start();
    }
}
