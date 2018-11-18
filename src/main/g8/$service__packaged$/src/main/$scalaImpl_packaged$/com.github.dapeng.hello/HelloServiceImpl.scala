package com.github.dapeng.hello

import com.github.dapeng.hello.scala.domain.Hello
import com.github.dapeng.hello.scala.service.HelloService

class HelloServiceImpl extends HelloService{
  /**
    *
    **
  say hello
    *
    **/
  override def sayHello(name: String): String = s"has received msg:  $name"

  /**
    *
    **/
  override def sayHello2(hello: Hello): String = s"has received msg: $hello"
}
