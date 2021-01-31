package com.wsc.service.impl;

import service.HelloService;
import service.doHelloService;

/**
 * 1，服务提供者注册到注册中心
 * 2.
 */
public class dohelloServiceImpl implements doHelloService {
    HelloService helloService;
    public String Hello(String name) {
        return "服务消费者："+ helloService.Hello(name);
    }
}
