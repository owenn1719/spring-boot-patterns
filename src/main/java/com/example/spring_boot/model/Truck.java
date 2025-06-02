package com.example.spring_boot.model;

import com.example.spring_boot.interfaces.Car;

public class Truck implements Car {
    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public String toString() {
        return "Truck{}";
    }
}
