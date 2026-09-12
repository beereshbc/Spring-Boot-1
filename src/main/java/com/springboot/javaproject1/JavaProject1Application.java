package com.springboot.javaproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class JavaProject1Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaProject1Application.class, args);
    }

    @GetMapping
    public List<String> Hello(){
        return List.of("Hello", "BeereshKumar B C");
    }

}
