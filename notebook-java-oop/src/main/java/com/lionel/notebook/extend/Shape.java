package com.lionel.notebook.extend;

public class Shape {

    private static final String DEFAULT_COLOR = "black";

    private String color;

    public Shape() {
        this(DEFAULT_COLOR);
        System.out.println("Shape构造方法");
    }

    {
        System.out.println("Shape初始化代码块");
    }

    static {
        System.out.println("Shape静态初始化代码块");
    }

    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("draw shape");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
