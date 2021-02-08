package com.wsc.service.impl;

import service.HelloService;

/**
 * 服务提供方实现方法
 */
public class helloServiceImpl implements HelloService {
    @Override
    public String Hello(String name) {
        return "provider:"+ name;
    }
}
