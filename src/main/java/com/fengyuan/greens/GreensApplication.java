package com.fengyuan.greens;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fengyuan.greens.dao")
public class GreensApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreensApplication.class, args);
    }

}