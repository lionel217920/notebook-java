package com.lionel.notebook.function;

/**
 * 数组类型的内存分配
 */
public class FunctionExample3 {

    public static int max(int min, int ... a) {
        int max = min;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4};
        int ret = max(0, arr);
        System.out.print(ret);
    }
}
