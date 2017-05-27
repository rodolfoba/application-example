package com.rodolfoba.application.helloworld;

public class HelloWorldApplication {

    public String sayHelloWorldTo(String name) {
        return new HelloWorld(name).sayHello();
    }

}
