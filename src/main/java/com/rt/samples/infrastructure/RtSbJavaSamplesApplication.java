package com.rt.samples.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.rt.samples")
public class RtSbJavaSamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RtSbJavaSamplesApplication.class, args);
    }
}