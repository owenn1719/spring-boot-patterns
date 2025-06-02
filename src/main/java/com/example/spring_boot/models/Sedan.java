package com.example.spring_boot.models;

import com.example.spring_boot.interfaces.Car;

public class Sedan implements Car {
    @Override
    public String getType() {
        return "Sedan";
    }

    @Override
    public String toString() {
        return "Sedan{}";
    }
}
