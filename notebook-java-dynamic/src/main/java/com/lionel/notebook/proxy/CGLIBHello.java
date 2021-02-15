package com.lionel.notebook.proxy;

/**
 * 委托类
 */
public class CGLIBHello {

    public String sayHello(String userName) {
        System.out.println("目标对象的方法执行了");
        return userName + "sayHello";
    }

    public String sayByeBye(String userName) {
        System.out.println("目标对象的方法执行了");
        return userName + "sayByeBye";
    }
}
