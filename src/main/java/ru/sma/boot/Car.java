package ru.sma.boot;

import org.springframework.beans.factory.annotation.Autowired;

class Car implements Vehicle {
    Engine engine;

    @Autowired
    Car(Engine engine) {
        this.engine = engine;
    }
}