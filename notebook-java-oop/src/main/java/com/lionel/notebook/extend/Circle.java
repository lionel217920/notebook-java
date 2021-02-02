package com.lionel.notebook.extend;

import com.lionel.notebook.clazz.Point;

public class Circle extends Shape {

    private Point center;

    private double r;

    public Circle(Point center, double r) {
        System.out.println("Circle构造方法");
        this.center = center;
        this.r = r;
    }

    {
        System.out.println("Circle初始化代码块");
    }

    static {
        System.out.println("Circle静态初始化代码块");
    }

    @Override
    public void draw() {
        System.out.println("draw circle at" + center.toString() + "with r" + r + ", using color :" + getColor());
    }

    public double area() {
        return Math.PI * r * r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
