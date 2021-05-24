package com.chips.design.learn.designmodle.proxy.staticproxy;

public class TestProxy implements Service {

    TestTarget testTarget=new TestTarget();

    @Override
    public void testStaticProxy() {
        System.out.println("代理操作");
        testTarget.testStaticProxy();
        System.out.println("代理操作结束");
    }
}
