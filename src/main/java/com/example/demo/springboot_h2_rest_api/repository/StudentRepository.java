package com.example.demo.springboot_h2_rest_api.repository;

import com.example.demo.springboot_h2_rest_api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
