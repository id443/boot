package ru.sma.boot;

import org.springframework.context.annotation.Bean;

class Engine {
    @Bean
    Engine engine() {
        return new Engine();
    }
}