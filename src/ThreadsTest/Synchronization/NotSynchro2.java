package ThreadsTest.Synchronization;

public class NotSynchro2 extends Thread{

    /**
     * create obj of class Not1
     */
    NotSynchro1 t;

    /**
     * constructor
     * @param t
     */
    NotSynchro2(NotSynchro1 t){
        this.t=t;
    }


    /**
     * override run()
     * call method print from NotSynchro1
     */
    @Override
    public void run() {
        t.print(5);
    }
}
