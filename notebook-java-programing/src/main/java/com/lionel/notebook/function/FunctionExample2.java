package com.lionel.notebook.function;

/**
 * 基本类型内存分配
 */
public class FunctionExample2 {

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int d = FunctionExample2.sum(1, 2);
        System.out.print(d);
    }
}
