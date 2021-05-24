package com.chips.design.learn.datastructer.queue;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Ferries.Lv
 * @desc 这是一个模拟实现的队列
 */
public class queue {

    //创建存储容器
    private List<Integer> data;


    private int p_start;


    //创建队列对象时初始化队列中的元素
    public queue() {
        data = new ArrayList<>();
        p_start = 0;
    }

    /**
     * 添加方法
     *
     * @param
     */
    public void add(Integer i) {
        data.add(i);
    }

    /**
     * 删除方法，默认移除最先进入队列的元素
     */
    public void delete() {
        data.remove(p_start);
        p_start++;
    }


    /**
     * 判断队列是否为空
     *
     * @return
     */
    public Boolean isEmpty() {
        if (data.size() == p_start) {
            return true;
        }
        return false;
    }


    /**
     * 判断队列是否满
     *
     * @return
     */
    public Boolean isFull() {
        if (data.size() == p_start) {
            return true;
        }
        return false;

    }


}
