package com.lionel.notebook.proxy;

public class JDKProxy {

    public static void main(String[] args) {
        Star liuDeHua = new LiuDeHua();
        StarProxy starProxy = new StarProxy();
        starProxy.setTarget(liuDeHua);

        Object o = starProxy.CreateProxyObj();
        Star star = (Star) o;
        System.out.println(star.dance("哈哈"));
    }
}
