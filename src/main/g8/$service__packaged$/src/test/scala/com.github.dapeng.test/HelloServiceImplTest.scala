package com.github.dapeng.test

import com.github.dapeng.hello.scala.HelloServiceClient

object HelloServiceImplTest {

  def main(args: Array[String]): Unit = {
    val response = new HelloServiceClient().sayHello("hello world! ")
    println(response)
  }
}
