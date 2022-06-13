package com.fiedlercooper.thymeleafTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiedlercooper.thymeleafTesting.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
