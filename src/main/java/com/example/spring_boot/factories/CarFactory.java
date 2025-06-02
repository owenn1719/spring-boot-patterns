package com.example.spring_boot.factories;

import com.example.spring_boot.interfaces.Car;
import com.example.spring_boot.models.*;
import com.example.spring_boot.singletons.CarCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {

    private final CarCounter carCounter;

    @Autowired
    public CarFactory(CarCounter carCounter) {
        this.carCounter = carCounter;
    }

    public Car createCar(String type) {
        Car car = switch (type.toLowerCase()) {
            case "sedan" -> new Sedan();
            case "suv" -> new SUV();
            case "truck" -> new Truck();
            default -> throw new IllegalArgumentException("Unknown car type: " + type);
        };
        carCounter.increment();
        return car;
    }
}
