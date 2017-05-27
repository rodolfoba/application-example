package com.rodolfoba.application.helloworld;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {

    @Test
    public void deveDizerHello() {
        String nome = "Nome";
        HelloWorldApplication app = new HelloWorldApplication();
        assertThat(app.sayHelloWorldTo(nome)).contains(nome);
    }
}