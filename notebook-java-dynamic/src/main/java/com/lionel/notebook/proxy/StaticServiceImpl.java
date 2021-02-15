package com.lionel.notebook.proxy;

import com.lionel.notebook.proxy.itf.StaticService;

public class StaticServiceImpl implements StaticService {

    @Override
    public String sayHello(String userName) {
        return "Hello " + userName;
    }
}
