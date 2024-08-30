package com.klind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.klind.mapper")
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
}
