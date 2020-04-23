package com.fd.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fo.springboot.mapper")
public class SpringbootQuick3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuick3Application.class, args);
    }

}
