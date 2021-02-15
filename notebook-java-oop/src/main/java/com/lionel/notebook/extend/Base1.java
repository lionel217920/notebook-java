package com.lionel.notebook.extend;

/**
 * 测试继承类加载的父类
 */
public class Base1 {

    public static int s;

    private int a;

    static {
        System.out.println("基类静态代码块初始化, s：" + s);
        s = 1;
    }

    {
        System.out.println("基类实例代码块初始化，a:" + a);
        a = 1;
    }

    public Base1() {
        System.out.println("基类构造方法, a:" + a + ", s :" + s);
        a = 2;
    }

    protected void step() {
        System.out.println("base s:" + s + ", a :" + a);
    }

    public void action () {
        System.out.println("start");
        step();
        System.out.println("end");
    }
}
