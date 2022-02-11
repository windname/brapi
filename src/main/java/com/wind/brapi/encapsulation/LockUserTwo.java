package com.wind.brapi.encapsulation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LockUserTwo {
    @Autowired
    public LockUserTwo(LockObject lock) {
        lock.getName();
    }
}
