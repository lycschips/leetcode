package com.chips.design.learn.designmodle.proxy.mvproxy;

public class TestMvProxyTarget implements ServiceInterface {


    @Override
    public Integer testServiceInterface() {

        System.out.println("执行目标方法");
        return 1;
    }
}
