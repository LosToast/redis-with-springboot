package com.redisbasic.redisbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisBasicApplication.class, args);
    }

}
