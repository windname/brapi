package com.wind.brapi.encapsulation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PostInitExecution {

    @PostConstruct
    public void startExecution() {
        System.out.println("Post init success");
    }
}
