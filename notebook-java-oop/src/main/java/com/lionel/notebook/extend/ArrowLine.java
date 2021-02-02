package com.lionel.notebook.extend;

import com.lionel.notebook.clazz.Point;

public class ArrowLine extends Line {

    private boolean startArrow;

    private boolean endArrow;

    public ArrowLine(Point start, Point end, String color, boolean startArrow, boolean endArrow) {
        super(start, end, color);
        this.startArrow = startArrow;
        this.endArrow = endArrow;
    }

    @Override
    public void draw() {
        super.draw();
        if (startArrow) {
            System.out.println("draw start arrow");
        }
        if (endArrow) {
            System.out.println("draw end arrow");
        }
    }

    public boolean isStartArrow() {
        return startArrow;
    }

    public void setStartArrow(boolean startArrow) {
        this.startArrow = startArrow;
    }

    public boolean isEndArrow() {
        return endArrow;
    }

    public void setEndArrow(boolean endArrow) {
        this.endArrow = endArrow;
    }
}
