package com.hawkeye;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hawkeye.mapper")
@SpringBootApplication
public class HawkeyeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HawkeyeApplication.class, args);
    }

}
