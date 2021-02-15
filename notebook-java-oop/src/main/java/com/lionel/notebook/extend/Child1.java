package com.lionel.notebook.extend;

/**
 * 测试继承类加载子类
 */
public class Child1 extends Base1 {

    public static int s;

    private int a;

    static {
        System.out.println("子类静态代码块初始化，s:" + s);
        s = 10;
    }

    {
        System.out.println("子类实例代码块初始化，a：" + a);
        a = 10;
    }

    public Child1() {
        System.out.println("子类构造方法, a:" + a + ", s:" + s);
        a = 20;
    }

    @Override
    protected void step() {
        System.out.println("child s:" + s + ", a:" + a);
    }
}
