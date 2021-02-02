package com.lionel.notebook.extend;

public class ShapeManager {

    private static final int MAX_NUM = 100;

    //private Shape shape = new Shape();

    //private Shape shape;

    private Shape[] shapes = new Shape[MAX_NUM];

    private int shapeNum = 0;

    public ShapeManager() {
        System.out.println("ShapeManager构造方法");
    }

    public void addShape(Shape shape) {
        if (shapeNum < MAX_NUM) {
            shapes[shapeNum++] = shape;
        }
    }

    {
        System.out.println("ShapeManager初始化代码块");
    }

    static {
        System.out.println("ShapeManager静态初始化代码块");
    }

    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
