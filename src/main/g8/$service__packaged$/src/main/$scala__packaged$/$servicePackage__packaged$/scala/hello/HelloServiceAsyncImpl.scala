package com.github.dapeng.scala.hello

import com.github.dapeng.hello.scala.domain.Hello
import com.github.dapeng.hello.scala.service.HelloServiceAsync
import scala.concurrent.ExecutionContext.Implicits.global

import scala.concurrent.Future

class HelloServiceAsyncImpl extends  HelloServiceAsync{
  /**
    *
    **/
  override def sayHello(hello: Hello, timeout: Long): Future[String] = {
    Future {s" hello: \${hello}, timeout: \${timeout} "}
  }
}