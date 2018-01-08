package com.isuwang.soa.hello;
        import com.isuwang.soa.hello.domain.serializer.*;

        import com.isuwang.dapeng.core.*;
        import com.isuwang.org.apache.thrift.*;
        import com.isuwang.org.apache.thrift.protocol.*;

        import com.isuwang.dapeng.core.definition.SoaServiceDefinition;
        import com.isuwang.dapeng.core.definition.SoaFunctionDefinition;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        import com.isuwang.soa.hello.service.HelloServiceAsync;
        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        public class HelloServiceAsyncCodec {

        
            public static class sayHello_args {
            
                private com.isuwang.soa.hello.domain.Hello hello;
                public com.isuwang.soa.hello.domain.Hello getHello(){
                return this.hello;
              }
                public void setHello(com.isuwang.soa.hello.domain.Hello hello){
                this.hello = hello;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("hello").append("\":").append(this.hello == null ? "null" : this.hello.toString()).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class sayHello_result {

            
                  private String success;
                  public String getSuccess(){
                  return success;
                }

                  public void setSuccess(String success){
                  this.success = success;
                }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":\"").append(success).append("\",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
          }

            public static class SayHello_argsSerializer implements BeanSerializer<sayHello_args>{
            
      @Override
      public sayHello_args read(TProtocol iprot) throws TException{

      sayHello_args bean = new sayHello_args();
      com.isuwang.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
              com.isuwang.soa.hello.domain.Hello elem0 = new com.isuwang.soa.hello.domain.Hello();
        elem0=new com.isuwang.soa.hello.domain.serializer.HelloSerializer().read(iprot);
       bean.setHello(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(sayHello_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("sayHello_args"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("hello", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.isuwang.soa.hello.domain.Hello elem0 = bean.getHello();
             new com.isuwang.soa.hello.domain.serializer.HelloSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(sayHello_args bean) throws TException{
      
              if(bean.getHello() == null)
              throw new SoaException(SoaBaseCode.NotNull, "hello字段不允许为空");
            
                if(bean.getHello() != null)
                new com.isuwang.soa.hello.domain.serializer.HelloSerializer().validate(bean.getHello());
              
    }
    

            @Override
            public String toString(sayHello_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class SayHello_resultSerializer implements BeanSerializer<sayHello_result>{
            @Override
            public sayHello_result read(TProtocol iprot) throws TException{

              sayHello_result bean = new sayHello_result();
              com.isuwang.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                    String elem0 = iprot.readString();
       bean.setSuccess(elem0);
                  }else{
                    com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(sayHello_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("sayHello_result"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 0));
            String elem0 = bean.getSuccess();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(sayHello_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
            
    }
    

            @Override
            public String toString(sayHello_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class sayHello<I extends com.isuwang.soa.hello.service.HelloServiceAsync> extends SoaFunctionDefinition.Async<I, sayHello_args, sayHello_result>
            {
              public sayHello()
              {
                super("sayHello", new SayHello_argsSerializer(),  new SayHello_resultSerializer());
              }

              @Override
              public CompletableFuture<sayHello_result> apply(HelloServiceAsync iface, sayHello_args sayHello_args) throws SoaException
              {

                CompletableFuture<String> result = (CompletableFuture<String>) iface.sayHello(sayHello_args.hello ,50000);

                return result.thenApply(( String i) -> {
                  sayHello_result res = new sayHello_result();
                  res.setSuccess(i);
                  return res;
              });
              }

            }
          
            public static class test_args {
            
                private String content;
                public String getContent(){
                return this.content;
              }
                public void setContent(String content){
                this.content = content;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("content").append("\":\"").append(content).append("\",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class test_result {

            
                  @Override
                  public String toString(){
                  return "{}";
                }
                
          }

            public static class Test_argsSerializer implements BeanSerializer<test_args>{
            
      @Override
      public test_args read(TProtocol iprot) throws TException{

      test_args bean = new test_args();
      com.isuwang.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setContent(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(test_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("test_args"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("content", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 1));
            String elem0 = bean.getContent();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(test_args bean) throws TException{
      
              if(bean.getContent() == null)
              throw new SoaException(SoaBaseCode.NotNull, "content字段不允许为空");
            
    }
    

            @Override
            public String toString(test_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class Test_resultSerializer implements BeanSerializer<test_result>{
            @Override
            public test_result read(TProtocol iprot) throws TException{

              test_result bean = new test_result();
              com.isuwang.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.VOID){
                    
      com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }else{
                    com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(test_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("test_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(test_result bean) throws TException{
      
    }
    

            @Override
            public String toString(test_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class test<I extends com.isuwang.soa.hello.service.HelloServiceAsync> extends SoaFunctionDefinition.Async<I, test_args, test_result>
            {
              public test()
              {
                super("test", new Test_argsSerializer(),  new Test_resultSerializer());
              }

              @Override
              public CompletableFuture<test_result> apply(HelloServiceAsync iface, test_args test_args) throws SoaException
              {

                CompletableFuture<Void> result = (CompletableFuture<Void>) iface.test(test_args.content ,50000);

                return result.thenApply((Void) -> {
                  test_result res = new test_result();
                  
                  return res;
              });
              }

            }
          

        public static class getServiceMetadata_args {

          @Override
          public String toString() {
            return "{}";
          }
        }


        public static class getServiceMetadata_result {

          private String success;

          public String getSuccess() {
            return success;
          }

          public void setSuccess(String success) {
            this.success = success;
          }

          @Override
          public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");
              stringBuilder.append("\"").append("success").append("\":\"").append(this.success).append("\",");
              stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

            return stringBuilder.toString();
          }
        }

        public static class GetServiceMetadata_argsSerializer implements BeanSerializer<getServiceMetadata_args> {

          @Override
          public getServiceMetadata_args read(TProtocol iprot) throws TException {

            getServiceMetadata_args bean =new getServiceMetadata_args();
            com.isuwang.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
                break;
              }
              switch (schemeField.id) {
                default:
                com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }


          @Override
          public void write(getServiceMetadata_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"));
            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_args bean) throws TException {}

          @Override
          public String toString(getServiceMetadata_args bean) {
            return bean == null ? "null" : bean.toString();
          }

        }

        public static class GetServiceMetadata_resultSerializer implements BeanSerializer<getServiceMetadata_result> {
          @Override
          public getServiceMetadata_result read(TProtocol iprot) throws TException {

            getServiceMetadata_result bean = new getServiceMetadata_result();
            com.isuwang.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
                break;
              }

              switch (schemeField.id) {
                case 0:  //SUCCESS
                if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING) {
                  bean.setSuccess(iprot.readString());
                } else {
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
                default:
                com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }

          @Override
          public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"));

            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 0));
            oprot.writeString(bean.getSuccess());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_result bean) throws TException {

            if (bean.getSuccess() == null)
            throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
          }

          @Override
          public String toString(getServiceMetadata_result bean) {
            return bean == null ? "null" : bean.toString();
          }
        }

        public static class getServiceMetadata<I extends com.isuwang.soa.hello.service.HelloService> extends SoaFunctionDefinition.Sync<I, getServiceMetadata_args, getServiceMetadata_result> {
          public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
          }

          @Override
          public getServiceMetadata_result apply(I iface, getServiceMetadata_args args) {
            getServiceMetadata_result result = new getServiceMetadata_result();

            try (InputStreamReader isr = new InputStreamReader(HelloServiceCodec.class.getClassLoader().getResourceAsStream("com.isuwang.soa.hello.service.HelloService.xml"));
            BufferedReader in = new BufferedReader(isr)) {
              int len = 0;
              StringBuilder str = new StringBuilder("");
              String line;
              while ((line = in.readLine()) != null) {

                if (len != 0) {
                  str.append("\r\n").append(line);
                } else {
                  str.append(line);
                }
                len++;
              }
              result.success = str.toString();

            } catch (Exception e) {
              e.printStackTrace();
              result.success = "";
            }

            return result;
          }

        }

        @SuppressWarnings("unchecked")
        public static class Processor<I extends com.isuwang.soa.hello.service.HelloServiceAsync> extends SoaServiceDefinition<com.isuwang.soa.hello.service.HelloServiceAsync>
        {

          public Processor(com.isuwang.soa.hello.service.HelloServiceAsync iface, Class<com.isuwang.soa.hello.service.HelloServiceAsync> ifaceClass)
          {
            super(iface, ifaceClass, buildMap(new java.util.HashMap<>()));
          }

          @SuppressWarnings("unchecked")
          private static <I extends com.isuwang.soa.hello.service.HelloServiceAsync> java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> buildMap(java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> processMap)
          {
            
                processMap.put("sayHello", new sayHello());
              
                processMap.put("test", new test());
              
            processMap.put("getServiceMetadata", new getServiceMetadata());
            return processMap;
          }
        }

      }
      