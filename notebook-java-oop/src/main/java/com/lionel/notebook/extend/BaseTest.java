package com.lionel.notebook.extend;

public class BaseTest {

    public static void main(String[] args) {
        Child c = new Child();
        Base b = c;
        System.out.println(b.s);
        System.out.println(b.m);
        b.staticTest();

        System.out.println(c.s);
        System.out.println(c.m);
        c.staticTest();
    }
}
