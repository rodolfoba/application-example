package com.rodolfoba.application.helloworld;

class HelloWorld {

    private final String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello, " + name;
    }

}
