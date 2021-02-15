package com.lionel.notebook.proxy;

import com.lionel.notebook.proxy.itf.StaticService;

public class StaticServiceProxy implements StaticService {

    private StaticService service = new StaticServiceImpl();

    @Override
    public String sayHello(String userName) {
        System.out.println("代理类包装一下");
        return service.sayHello(userName);
    }
}
