package com.lionel.notebook.clazz;

public class Point {

    private int x;

    private int y;


    public Point() {
        this(2, 3);
        System.out.println("Point构造方法");
    }

    public Point(int x, int y) {
        System.out.println("Point构造方法");
        this.x = x;
        this.y = y;
    }

    static {
        System.out.println("Point静态初始化代码块");
    }

    {
        System.out.println("Point初始化代码块");
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
