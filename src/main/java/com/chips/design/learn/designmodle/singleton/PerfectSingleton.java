package com.chips.design.learn.designmodle.singleton;


/**
 * 使用静态内部类实现单例模式利用虚拟机的机制来保证单例模式的唯一性
 */
public class PerfectSingleton {

    private PerfectSingleton() {

    }

    public static class InnerSingleton {

        final static PerfectSingleton instance = new PerfectSingleton();

    }


    public PerfectSingleton getInstance() {
        return InnerSingleton.instance;
    }

}
