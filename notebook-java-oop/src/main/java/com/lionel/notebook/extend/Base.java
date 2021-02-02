package com.lionel.notebook.extend;

public class Base {

    private String number;

    public Base() {
        System.out.println("Base构造方法");
        test();
    }

    public Base(String number) {
        this.number = number;
    }

    public void test() {

    }
}
