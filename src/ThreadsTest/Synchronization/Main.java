package ThreadsTest.Synchronization;

public class Main {
    public static void main(String[] args) {
        NotSynchro1 synchro1 = new NotSynchro1();
        NotSynchro2 thread2 = new NotSynchro2(synchro1);
        NotSynchro3 thread3 = new NotSynchro3(synchro1);

        thread2.start();
        thread3.start();
    }
}
