package com.example.spring_boot.controllers;

import com.example.spring_boot.factories.CarFactory;
import com.example.spring_boot.interfaces.Car;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/factory")
public class CarController {

    @GetMapping("/car")
    public String getCar(@RequestParam String type) {
        try {
            Car car = CarFactory.createCar(type);
            return "Created car of type: " + car.getType();
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
