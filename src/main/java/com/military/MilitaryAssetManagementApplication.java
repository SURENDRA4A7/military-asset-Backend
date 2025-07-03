package com.military;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.military") // Adjust to your root package
public class MilitaryAssetManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(MilitaryAssetManagementApplication.class, args);
    }
}
