package com.wsc.service.impl;

import service.HelloService;

public class helloServiceImpl implements HelloService {
    @Override
    public String Hello(String name) {
        return name +":hello Dubbo!!!";
    }
}
