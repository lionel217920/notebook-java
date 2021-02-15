package com.lionel.notebook.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CglibInterceptor 用于对方法调用拦截以及回调
 */
public class CGLIBInterceptor implements MethodInterceptor {

    /**
     * 代理对象是由Enhancer创建的
     * CGLIB 增强类对象
     */
    private Enhancer enhancer = new Enhancer();

    /**
     *
     * @param o 被代理的对象
     * @param method 代理的方法
     * @param objects 方法参数
     * @param methodProxy CGLIB方法代理对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法调用之前");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("方法调用之后");
        return invoke;
    }

    /**
     * 使用动态代理创建一个代理对象
     * @param c
     * @return
     */
    public Object newProxyInstance(Class<?> c) {
        enhancer.setSuperclass(c);

        enhancer.setCallback(this);

        return enhancer.create();
    }
}
