package com.springboot.javaproject1;

import com.springboot.javaproject1.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class JavaProject1Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaProject1Application.class, args);
    }

    @GetMapping
    public List<Student> Hello(){
        return List.of(
                new Student(
                        1L,
                        "Beereshkumar B C",
                        "bcbeereshkumar@gmail.com",
                        LocalDate.of(2005, Month.JULY, 28),
                        21
                )
        );
    }

}
