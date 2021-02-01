package com.lionel.notebook.function;

/**
 * 递归调用示例
 */
public class FunctionExample4 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int ret = factorial(4);
        System.out.print(ret);
    }
}
