package com.lionel.notebook.function;

/**
 * 参数是数组的方法调用
 */
public class FunctionExample1 {

    public static void reset(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        reset(arr);
        for (int i = 0; i < arr.length; i++) {
            // 数组内容已改变
            System.out.print(i);
        }
    }

    /**
     * 可变长度参数示例
     * 1. 只能在末尾
     * 2. 只有一个
     * @param min
     * @param a
     * @return
     */
    public static int max(int min, int ... a) {
        int max = min;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
}
