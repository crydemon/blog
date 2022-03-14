package com.wq.lrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(LrmApplication.class, args);
    }

}
