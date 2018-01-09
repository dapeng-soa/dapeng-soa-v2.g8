package com.github.dapeng.hello;

import com.github.dapeng.core.SoaException;
import com.github.dapeng.hello.domain.Hello;
import com.github.dapeng.hello.service.HelloServiceAsync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class HelloServiceAsyncImpl implements HelloServiceAsync {
    @Override
    public Future<String> sayHello(Hello hello, long timeout) throws SoaException {
        return CompletableFuture.supplyAsync(() -> hello.toString());
    }
}
