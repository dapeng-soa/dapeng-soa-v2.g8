namespace java $organization$.hello.service

include "hello_domain.thrift"

service HelloService {

    string sayHello(1: hello_domain.Hello hello)

}