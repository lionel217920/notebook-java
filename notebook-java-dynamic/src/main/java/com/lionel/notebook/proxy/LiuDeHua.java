package com.lionel.notebook.proxy;

public class LiuDeHua implements Star {


    @Override
    public String sing(String name) {
        System.out.println("给我一杯忘情水");
        return "唱完";
    }

    @Override
    public String dance(String name) {
        System.out.println("我不咋会跳这个 ：" + name + "舞蹈啊");
        return "跳舞不行";
    }
}
