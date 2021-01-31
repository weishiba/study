package com.wsc.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.doHelloService;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        doHelloService doHelloService = applicationContext.getBean(doHelloService.class);
        doHelloService.Hello("小玲！！！");
        System.in.read();
    }
}