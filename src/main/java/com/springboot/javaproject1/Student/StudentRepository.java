package com.springboot.javaproject1.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends
        JpaRepository<Student, Long> {

}
