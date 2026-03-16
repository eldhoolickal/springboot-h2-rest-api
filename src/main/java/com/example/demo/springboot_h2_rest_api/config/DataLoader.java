package com.example.demo.springboot_h2_rest_api.config;


import com.example.demo.springboot_h2_rest_api.entity.Student;
import com.example.demo.springboot_h2_rest_api.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    /*@Bean
    public CommandLineRunner loadDBData(StudentRepository studentRepository){
        return args ->{
            studentRepository.save(new Student("Dave","dave123@gmail.com"));
            studentRepository.save(new Student("Calvin","calvin@gmail.com"));
            studentRepository.save(new Student("Luke","luke23@gmail.com"));
        };
    }*/
}
