package com.southwind.mmall002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.southwind.mmall002.mapper")
public class Mmall002Application {

    public static void main(String[] args) {
        SpringApplication.run(Mmall002Application.class, args);
    }

}
