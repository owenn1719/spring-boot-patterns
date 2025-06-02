package com.example.spring_boot.controllers;

import com.example.spring_boot.factories.CarFactory;
import com.example.spring_boot.interfaces.Car;
import com.example.spring_boot.singletons.CarCounter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CarController {

    private final CarFactory carFactory;
    private final CarCounter carCounter;

    public CarController(CarFactory carFactory, CarCounter carCounter) {
        this.carFactory = carFactory;
        this.carCounter = carCounter;
    }

    @GetMapping("/factory/car")
    public String getCar(@RequestParam String type) {
        try {
            Car car = carFactory.createCar(type);
            return "Created car of type: " + car.getType();
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    @GetMapping("/singleton/count")
    public String getCarCount() {
        return "Total cars created: " + carCounter.getCount();
    }
}
