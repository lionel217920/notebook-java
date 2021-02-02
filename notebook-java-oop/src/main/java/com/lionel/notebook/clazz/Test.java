package com.lionel.notebook.clazz;

public class Test {

    /**
     * 对象和类的初始化顺序
     * 代码块、静态代码块，构造方法执行顺序
     */
    public static void test1() {
        Point p1 = new Point();
        System.out.println(p1.distance());

        Point p2 = new Point();
        System.out.println(p2.distance());
    }

    /**
     * 测试类的组合
     * 内存分布
     */
    public static void test2() {
        Point start = new Point(2, 3);
        Point end = new Point(3, 4);
        Line line = new Line(start, end);
        System.out.println(line.length());
    }

    public static void test3() {
        Person father = new Person("father");
        Person son = new Person("son");
        son.setFather(father);
        father.setChildren(new Person[]{son});
        System.out.println(son.getFather().getName());
    }

    public static void main(String[] args) {
        //test2();
        test3();
    }


}
