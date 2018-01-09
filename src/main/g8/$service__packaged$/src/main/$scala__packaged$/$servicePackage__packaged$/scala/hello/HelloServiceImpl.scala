package com.github.dapeng.scala.hello

import com.github.dapeng.hello.scala.domain.Hello
import com.github.dapeng.hello.scala.service.HelloService

import com.github.dapeng.hello.scala.service.HelloService


class HelloServiceImpl extends HelloService {

  /**
    *
    **/
  override def sayHello(hello: Hello): String = {
    s" hello: \${hello.content} "
  }
}
