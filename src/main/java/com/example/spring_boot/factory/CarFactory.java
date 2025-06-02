package com.example.spring_boot.factory;
import com.example.spring_boot.interfaces.Car;
import com.example.spring_boot.model.*;

public class CarFactory {
    public static Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "suv":
                return new SUV();
            case "sedan":
                return new Sedan();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}
