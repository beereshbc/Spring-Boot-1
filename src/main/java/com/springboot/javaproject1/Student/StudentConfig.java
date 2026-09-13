package com.springboot.javaproject1.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {

            Student beereshkumarBC = new Student(
                    21,
                    "Beereshkumar B C",
                    "bcbeereshkumar@gmail.com",
                    LocalDate.of(2005, Month.JULY, 28)
            );

            Student alice = new Student(
                    21,
                    "Alice B B",
                    "abb@gmail.com",
                    LocalDate.of(2006, Month.JUNE, 2)
            );

            repository.saveAll(
                    List.of(beereshkumarBC, alice)
            );

        };
    }

}
