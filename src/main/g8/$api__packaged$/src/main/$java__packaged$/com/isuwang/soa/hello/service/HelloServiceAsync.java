
        package com.isuwang.soa.hello.service;

        import com.isuwang.dapeng.core.Processor;
        import com.isuwang.dapeng.core.Service;
        import com.isuwang.dapeng.core.SoaGlobalTransactional;

        import java.util.concurrent.Future;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 

 Hello Service

        **/
        @Service(name="com.isuwang.soa.hello.service.HelloService",version = "1.0.0")
        @Processor(className = "com.isuwang.soa.hello.HelloServiceAsyncCodec\$Processor")
        public interface HelloServiceAsync {
        
            /**
            * 
            **/
            
            
              Future<String> sayHello( com.isuwang.soa.hello.domain.Hello hello , long timeout) throws com.isuwang.dapeng.core.SoaException;
            
          
            /**
            * 
            **/
            
            
              Future<Void> test( String content , long timeout) throws com.isuwang.dapeng.core.SoaException;
            
          
      }
      