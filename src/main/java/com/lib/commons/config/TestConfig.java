package com.lib.commons.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    private String teste = "123";

    public String getTeste() {
        return teste;
    }
}