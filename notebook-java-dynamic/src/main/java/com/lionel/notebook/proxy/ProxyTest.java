package com.lionel.notebook.proxy;

import com.lionel.notebook.proxy.itf.DynamicJDKService;

public class ProxyTest {

    public static void main(String[] args) {

        // 静态代理测试类
        //staticProxyTest();

        // JDK动态代理测试
        //dynamicJdkTest();

        // cglib动态代理测试
        dynamicCGLIBTest();
    }

    /**
     * 测试静态代理类
     */
    public static void staticProxyTest() {
        StaticServiceProxy proxy = new StaticServiceProxy();
        String name = proxy.sayHello("Lionel");
        System.out.println(name);
    }

    /**
     * JDK动态代理测试
     */
    public static void dynamicJdkTest() {
        DynamicJDKService liuDeHua = new DynamicJDKServiceImpl();
        DynamicJDKProxy starProxy = new DynamicJDKProxy();
        starProxy.setTarget(liuDeHua);

        Object o = starProxy.CreateProxyObj();
        DynamicJDKService star = (DynamicJDKService) o;
        System.out.println(star.dance("哈哈"));
    }

    /**
     * CGLIB动态代理测试
     */
    public static void dynamicCGLIBTest() {
        CGLIBInterceptor cglibProxy = new CGLIBInterceptor();
        Object o = cglibProxy.newProxyInstance(CGLIBHello.class);
        CGLIBHello cglibHello = (CGLIBHello) o;
        cglibHello.sayHello("Lionel");
        cglibHello.sayByeBye("Lionel");
    }
}
