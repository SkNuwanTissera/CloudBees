package com.awsebs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        home();
        SpringApplication.run(DemoApplication.class, args);
    }
    @RequestMapping("/")
    static String home() {
        return "Hello AWS EBS";
    }

}
