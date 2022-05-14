package org.line.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.line"})
public class CoreIoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoreIoApplication.class, args);
    }
}
