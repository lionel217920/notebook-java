package com.lionel.notebook.clazz;

public class Line {

    private Point start;

    private Point end;

    static {
        System.out.println("Line静态初始化代码块");
    }

    {
        System.out.println("Line初始化代码块");
    }

    public Line(Point start, Point end) {
        System.out.println("Line构造方法");
        this.start = start;
        this.end = end;
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
