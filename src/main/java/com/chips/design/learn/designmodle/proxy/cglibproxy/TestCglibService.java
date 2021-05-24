package com.chips.design.learn.designmodle.proxy.cglibproxy;

public class TestCglibService {

    public TestCglibService() {
        System.out.println("init testCglibService");
    }


    final public String sayOthers(){
        System.out.println("");
        return null;
    }


    public Integer sayHello(){
        System.out.println("Hello Word");
        return 1;
    }

}
