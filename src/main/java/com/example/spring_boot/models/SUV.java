package com.example.spring_boot.models;

import com.example.spring_boot.interfaces.Car;

public class SUV implements Car {
    @Override
    public String getType() {
        return "SUV";
    }

    @Override
    public String toString() {
        return "SUV{}";
    }
}
