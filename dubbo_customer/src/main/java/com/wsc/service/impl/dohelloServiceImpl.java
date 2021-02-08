package com.wsc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.HelloService;
import service.doHelloService;

import java.sql.SQLOutput;

/**
 * 消费者实现方法
 * 1，服务提供者注册到注册中心
 * 2.
 */
@Service
public class dohelloServiceImpl implements doHelloService {
    @Autowired
    HelloService helloService;
    @Override
    public String Hello(String name) {
        System.out.println(helloService.Hello(name));
        return "consumer:" + name;
    }
}
