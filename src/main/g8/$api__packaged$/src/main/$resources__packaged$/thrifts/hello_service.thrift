namespace java $servicePackage$.hello.service

include "hello_domain.thrift"

/**
* Hello Service
**/
service HelloService {

    /**
    * say hello
    **/
    string sayHello(1:string name),

    string sayHello2(1:hello_domain.Hello hello)

}