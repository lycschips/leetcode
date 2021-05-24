package com.chips.design.learn.designmodle.proxy.mvproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestMvProxy {


    public static void main(String[] args) {
        TestMvProxyTarget t = new TestMvProxyTarget();
        ServiceInterface s = (ServiceInterface) TestMvProxy.creatProxy(t);
        Integer integer = s.testServiceInterface();
        System.out.println(integer);
    }




    public  static Object createdProxy2(Object target){

        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //代理业务
                Object invoke = method.invoke(target, args);
                return invoke;
            }
        });
        return o;
    }


    public static Object creatProxy(Object target) {
        Object o = Proxy.newProxyInstance(
                target.getClass().getClassLoader()
                , target.getClass().getInterfaces(), new InvocationHandler() {

                    /*
                     * 该方法用于调用目标代理类的方法，该方法返回什么目标方法就返回什么值
                     * @param proxy 将来即将生成的代理对象
                     * @param method 代理对象的某一个方法
                     * @param args
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("执行动态代理方法");
                        Object result = method.invoke(target, args);
                        return result;
                    }
                });
        return o;
    }

}
