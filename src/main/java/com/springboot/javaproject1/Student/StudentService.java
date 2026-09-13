package com.springboot.javaproject1.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component //Component gives the priority to run the classes in java
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addNewStudent(Student student) {
        System.out.println("Controller reached");
        System.out.println(student);
    }

    public List<Student> getStudent(){
         return studentRepository.findAll();
    }
}
