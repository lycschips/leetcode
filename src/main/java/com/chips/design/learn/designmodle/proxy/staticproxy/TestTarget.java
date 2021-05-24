package com.chips.design.learn.designmodle.proxy.staticproxy;


/**
 * 目标对象用于真正执行业务，同样实现Service 接口
 */
public class TestTarget implements Service {



    @Override
    public void testStaticProxy() {
        System.out.println("执行业务逻辑");
    }


    public static void main(String[] args) {
        Service t1=new TestProxy();

        t1.testStaticProxy();
    }


}
