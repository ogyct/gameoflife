package com.augy.gameoflife;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameoflifeApplication {
    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication.run(GameoflifeApplication.class);
    }
}
