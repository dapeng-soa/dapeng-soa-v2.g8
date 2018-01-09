namespace java $organization$.hello.service

include "hello_domain.thrift"

service HelloService {

    hello_domain.Hello sayHello(1: hello_domain.Hello content)

}