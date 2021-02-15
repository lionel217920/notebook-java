package com.lionel.notebook.extend;

/**
 * 继承类加载过程测试入口
 */
public class BaseTest1 {

    public static void main(String[] args) {
        System.out.println("----new Child()----");
        Child1 c = new Child1();
        System.out.println("\n ---- c.action()");
        c.action();
        Base1 b = c;
        System.out.println("\n ---- b.action()");
        b.action();

        System.out.println("\n ------b.s:" + b.s);
        System.out.println("\n ------c.s:" + c.s);
    }
}
