package com.lionel.notebook.exception;

public class CatchExample {

    /**
     * 找到第一个匹配的catch，后面的都不执行
     */
    public static void test() {
        String number = "s";
        try {
            Integer a = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("NumberFormatException");
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("RuntimeException");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
    }

    /**
     * 类型是子类的情况，注释的代码会报错
     */
    public static void test1() {
        String number = "s";
        try {
            Integer a = Integer.parseInt(number);
        }  catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("RuntimeException");
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//            System.out.println("NumberFormatException");
//        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception");
        }
    }

    public static void main(String[] args) {
        test();

        test();
    }

}
