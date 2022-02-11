package com.wind.brapi.encapsulation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PostInitConfig {
    @Bean @Scope("prototype")
    public LockObject getLock(){
        return new LockObject();
    }
}
