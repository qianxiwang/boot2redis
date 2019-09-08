package com.example.boot2redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Boot2redisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot2redisApplication.class, args);
    }

}
