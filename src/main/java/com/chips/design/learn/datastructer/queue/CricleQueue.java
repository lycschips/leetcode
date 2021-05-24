package com.chips.design.learn.datastructer.queue;


import org.springframework.stereotype.Component;

/**
 * 环形队列的实现
 */
public class CricleQueue {

    //存放数据的数组
    private Integer[] data;

    //队列头
    private Integer head;

    //队列尾
    private Integer tail;

    //标识队列长度
    private Integer size;

    /**
     * 初始化队列构造方法，设置初始长度，并将存储数据的数组长度初始化为k
     * @param k
     */
    public CricleQueue(int k) {
        data = new Integer[k];
        size = k;
        head = -1;
        tail = -1;
    }

    /**
     * 向队列中添加元素
     *
     * @return
     */
    public Boolean enQueue(int k) {
        if (isFull() == true) {
            System.out.println("队列满");
            return false;
        }
        if (isEmpty() == true) {
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = k;
        return true;
    }

    /**
     * 删除队列中的元素
     *
     * @return
     */
    public Boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return head == -1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }


//    public static void main(String[] args) {
//        CricleQueue queue=new CricleQueue(3);
//        queue.enQueue(0);
//        System.out.println("队列头 ---->"+queue.head);
//        System.out.println("队列尾巴 ---->"+queue.tail);
//        System.out.println("队列剩余空间--->"+queue.data.length);
//
//        queue.enQueue(1);
//        System.out.println("队列头 ---->"+queue.head);
//        System.out.println("队列尾巴 ---->"+queue.tail);
//        System.out.println("队列剩余空间--->"+queue.data.length);
//
//        queue.enQueue(2);
//        System.out.println("队列头 ---->"+queue.head);
//        System.out.println("队列尾巴 ---->"+queue.tail);
//        System.out.println("队列剩余空间--->"+queue.data.length);
//
//        queue.enQueue(4);
//        System.out.println("队列头 ---->"+queue.head);
//        System.out.println("队列尾巴 ---->"+queue.tail);
//        System.out.println("队列剩余空间--->"+queue.data.length);
//
//        for (Integer datum : queue.data) {
//            System.out.println(datum);
//        }

    }




