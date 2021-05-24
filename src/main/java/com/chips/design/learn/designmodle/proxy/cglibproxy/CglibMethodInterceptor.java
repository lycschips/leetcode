package com.chips.design.learn.designmodle.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibMethodInterceptor implements MethodInterceptor {


    /**
     * @param o 此处o对象传入的是被代理对象的类对象
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置通知");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("后置通知");
        return o1;
    }


    public static void main(String[] args) {
        /*
         *创建enhancer 对象
         * enhancer n 增强器
         */
        Enhancer enhancer = new Enhancer();

        //创建 增强器父类，其实就是传入被代理对象的类对象
        enhancer.setSuperclass(TestCglibService.class);

        //指明方法增强器的实现对象
        enhancer.setCallback(new CglibMethodInterceptor());

        //创建代理对象
        TestCglibService service = (TestCglibService) enhancer.create();

        //调用代理对象的方法
        Integer integer = service.sayHello();
    }
}
