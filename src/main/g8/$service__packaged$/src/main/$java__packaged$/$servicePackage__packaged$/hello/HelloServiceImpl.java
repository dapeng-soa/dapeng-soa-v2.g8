package com.github.dapeng.hello;

import com.github.dapeng.core.SoaException;
import com.github.dapeng.hello.domain.Hello;
import com.github.dapeng.hello.service.HelloService;

public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(Hello hello) throws SoaException {
        return "hello: " + hello.toString();
    }
}
