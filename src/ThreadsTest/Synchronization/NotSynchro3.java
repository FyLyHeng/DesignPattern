package ThreadsTest.Synchronization;

public class NotSynchro3 extends Thread{
    NotSynchro1 t;

    NotSynchro3(NotSynchro1 t){
        this.t = t;
    }

    @Override
    public void run() {
        t.print(100);
    }
}
