package com.example.spring_boot.singletons;

import org.springframework.stereotype.Component;

@Component
public class CarCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
