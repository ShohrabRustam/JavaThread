package src;

public class Test1 extends Thread {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
