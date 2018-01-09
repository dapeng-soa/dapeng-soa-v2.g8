package com.github.dapeng.soa.hello;

import com.github.dapeng.core.SoaException;
import com.github.dapeng.soa.hello.domain.Hello;
import com.github.dapeng.soa.hello.service.HelloService;

public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(Hello hello) throws SoaException {
        return "hello: " + hello.toString();
    }
}
