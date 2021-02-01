package com.lionel.notebook.flow;

import java.util.Scanner;

/**
 * 带标签的break语句
 */
public class FlowExample1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter loop count");
        int a = sc.nextInt();
        int n;
        read_data:

        while (true) {

            for (int i = 0; i < a; i++) {
                System.out.print("Enter a number >=0");
                n = sc.nextInt();
                if (n < 0) {
                    break read_data;
                }

                System.out.print("Yes");
            }
        }
    }
}
