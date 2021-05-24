package com.chips.design.learn.designmodle.singleton;

public class Singleton {


    private static Singleton instance = new Singleton();


    private Singleton() {
    }

    public static Singleton newInstance() {
        return instance;
    }


}
