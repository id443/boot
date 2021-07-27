package ru.sma.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Biker {
    Vehicle vehicle;
    @Autowired

    Biker(@Qualifier("bike") Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
