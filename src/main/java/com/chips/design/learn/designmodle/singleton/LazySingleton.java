package com.chips.design.learn.designmodle.singleton;



/**
 * 线程安全的单例模式
 */

public class LazySingleton {

    private static LazySingleton instance;


    private LazySingleton() {
    }


    public LazySingleton getInstance() {

        if (null == instance) {

            synchronized (LazySingleton.class) {
                if (null == instance) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
