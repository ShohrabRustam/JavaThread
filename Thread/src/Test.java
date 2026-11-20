package src;

import src.Thread.Counter;
import src.Thread.MyThread;

public class Test {
    public static void main(String[] args) {
        Test1 world = new Test1();
        world.start();
        TestThread2 testThread2 = new TestThread2();
        Thread thread = new Thread(testThread2);
        thread.start();
        System.out.println(Thread.currentThread().getName());

        Counter counter = new Counter();
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
    }
}
