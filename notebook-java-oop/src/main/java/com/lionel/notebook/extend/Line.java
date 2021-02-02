package com.lionel.notebook.extend;

import com.lionel.notebook.clazz.Point;

public class Line extends Shape {

    private Point start;

    private Point end;

    public Line(Point start, Point end, String color) {
        super(color);
        this.start = start;
        this.end = end;
        System.out.println("Line构造方法");
    }

    static {
        System.out.println("Line静态初始化代码块");
    }

    {
        System.out.println("Line初始化代码块");
    }

    @Override
    public void draw() {
        System.out.println("draw line from " + start.toString()
                + "to" + end.toString() + "using color :" + super.getColor());
    }

    public double length() {
        return start.distance(end);
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
}
