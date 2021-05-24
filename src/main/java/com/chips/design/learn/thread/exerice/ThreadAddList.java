package com.chips.design.learn.thread.exerice;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 多线程对List里的值求和
 */
public class ThreadAddList implements Callable {


    private List<Integer> addList = new ArrayList();


    public ThreadAddList(List<Integer> addList) {
        this.addList = addList;
    }

    @Override
    public Object call() throws Exception {

        System.out.println("当前线程为"+Thread.currentThread().getName());


        int result=0 ;

        for (Integer a : addList) {
            result += a.intValue();
        }
        return result;
    }


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            list.add(i);
        }

        //简单的值List分为两段
        int start = 0;
        int end = list.size();
        int middle = (start + end) / 2;

        List<Integer> list1 = list.subList(start, middle);

        List<Integer> list2 = list.subList(middle , end);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future submit = executorService.submit(new ThreadAddList(list1));

        Future submit1 = executorService.submit(new ThreadAddList(list2));

        try {
            int result = (Integer) submit.get() + (Integer) submit1.get();

            System.out.println(result);

            executorService.shutdown();

        } catch (Exception e) {

        }

    }


}
