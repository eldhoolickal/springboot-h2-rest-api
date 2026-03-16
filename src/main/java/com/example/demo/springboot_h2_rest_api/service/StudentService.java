package com.example.demo.springboot_h2_rest_api.service;

import com.example.demo.springboot_h2_rest_api.entity.Student;
import com.example.demo.springboot_h2_rest_api.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow();
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id,Student student){
        Student existing =  studentRepository.findById(id).orElseThrow();
        existing.setName(student.getName());
        existing.setEmail(student.getEmail());
        return studentRepository.save(existing);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
