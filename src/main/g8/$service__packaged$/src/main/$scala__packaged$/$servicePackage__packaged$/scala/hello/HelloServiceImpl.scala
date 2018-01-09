package com.github.dapeng.soa.scala.hello

import com.github.dapeng.soa.hello.scala.domain.Hello
import com.github.dapeng.soa.hello.scala.service.HelloService

import com.github.dapeng.soa.hello.scala.service.HelloService


class HelloServiceImpl extends HelloService {

  /**
    *
    **/
  override def sayHello(hello: Hello): String = {
    s" hello: \${hello.content} "
  }
}
