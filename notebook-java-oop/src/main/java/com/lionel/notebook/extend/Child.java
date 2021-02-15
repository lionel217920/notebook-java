package com.lionel.notebook.extend;

public class Child extends Base {

    public static String s = "child_base";

    public String m = "child";

    private int a = 123;

    public Child() {
        System.out.println("Child构造方法");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.test();
    }

    public Child(String number) {
        super(number);
    }

    @Override
    public void test() {
        System.out.println(a);
    }

    public static void staticTest() {
        System.out.println("child static :" + s);
    }
}
