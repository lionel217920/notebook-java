package com.lionel.notebook.extend;

public class Base {

    public static String s = "static_base";

    public String m = "base";

    private String number;

    public Base() {
        System.out.println("Base构造方法");
        // 子类重写方法，输出子类变量a的值为0
        test();
    }

    public Base(String number) {
        this.number = number;
    }

    public void test() {

    }

    public static void staticTest() {
        System.out.println("base static : " + s);
    }
}
