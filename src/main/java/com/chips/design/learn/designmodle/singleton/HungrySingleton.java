package com.chips.design.learn.designmodle.singleton;

public class HungrySingleton {


    private static HungrySingleton instance=new HungrySingleton();


    private HungrySingleton() {
    }

    public HungrySingleton getInstance(){
        return instance;
    }

}
