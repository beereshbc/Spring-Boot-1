package com.springboot.javaproject1.Student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component //Component gives the priority to run the classes in java
public class StudentService {

    public List<Student> getStudent(){
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
