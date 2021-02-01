package com.lionel.notebook.exception;

import java.util.Scanner;

public class FinallyExample {

    /**
     * try/catch/finally 有异常发生
     */
    public static void test1() {
        Scanner sc = new Scanner(System.in);
        String numberString = "s";

        try {
            System.out.println("try 执行");
            Integer.parseInt(numberString);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("catch 执行");
        } finally {
            System.out.println("finally 执行");
        }
    }

    /**
     * try/catch/finally 无异常发生
     */
    public static void test2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        String number = sc.next();

        try {
            System.out.println("try 执行");
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("catch 执行");
        } finally {
            System.out.println("finally 执行");
        }
    }

    /**
     * 有异常发生没有被捕获，异常抛给上层之前执行
     */
    public static void test3 () {
        try {
            Integer a = Integer.parseInt("s");
        } finally {
            System.out.println("finally 执行");
        }
    }

    /**
     * try里面有return语句
     */
    public static int test4() {
        int ret = 0;
        try {
            System.out.println("try执行");
            return ret;
        } finally {
            System.out.println("finally执行");
        }
    }

    /**
     * try/catch里面有return语句
     * finally并不会改变返回值
     * @return
     */
    public static int test5 () {
        int ret = 0;
        try {
            Integer b = Integer.parseInt("s");
            return b;
        } catch (NumberFormatException e) {
            System.out.println("catch 执行");
            return ret;
        } finally {
            ret = 20;
            System.out.println("finally执行");
        }
    }

    /**
     * finally中有return语句
     * 1。try/catch的return语句会丢失，实际返回finally中的值
     * 2。try/catch内的异常会被覆盖
     */
    public static int test6() {
        int ret = 0;
        try {
            int a = 5 / 0;
            return ret;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();

//        int ret = test4();
//        System.out.println("return 后面");

//        int ret = test5();
//        System.out.println("return 后面" + ret);

        int ret = test6();
        System.out.println("return 后面" + ret);
    }
}
