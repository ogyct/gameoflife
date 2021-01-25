package com.augy.gameoflife;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameoflifeApplication {
    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication.run(GameoflifeApplication.class);
    }
}
