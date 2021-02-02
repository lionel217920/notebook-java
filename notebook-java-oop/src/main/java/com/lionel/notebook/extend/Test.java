package com.lionel.notebook.extend;

import com.lionel.notebook.clazz.Point;

public class Test {

    public static void test() {
        Point center = new Point(2, 3);
        Circle circle = new Circle(center, 2);
        circle.draw();
        System.out.println(circle.area());
    }

    public static void test1() {
        ShapeManager manager = new ShapeManager();
        manager.addShape(new Circle(new Point(4, 4), 3));
        manager.addShape(new Line(new Point(2, 3), new Point(3, 4), "GREEN"));
        manager.addShape(new ArrowLine(new Point(1, 2), new Point(5, 5),
                "black", false, true));
        manager.draw();
    }

    public static void main(String[] args) {
        //test();

        test1();
    }
}
