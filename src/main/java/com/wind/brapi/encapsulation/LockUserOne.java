package com.wind.brapi.encapsulation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LockUserOne {
    @Autowired
    public LockUserOne(LockObject lock) {
        lock.getName();
    }

}
