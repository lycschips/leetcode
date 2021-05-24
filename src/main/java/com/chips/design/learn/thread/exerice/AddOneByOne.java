package com.chips.design.learn.thread.exerice;


/**
 * 多线程交替相加至1到100的和
 */
public class AddOneByOne implements Runnable {


    int i = 1;

    public static void main(String[] args) {
        AddOneByOne t = new AddOneByOne();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.setName("线程1");

        t2.setName("线程2");

        t1.start();t2.start();
    }

    public void run() {
        while (true) {
            synchronized (this) {
                // 先唤醒另外一个线程
                notify();

                if (i <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":"+ i);
                    i++;
                    try {
                        // 打印完之后，释放资源，等待下次被唤醒
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
