package com.studentdetails;

import com.studentdetails.model.Student;
import com.studentdetails.repository.Studentrepository;
import com.studentdetails.repository.Studentrepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudetDetailsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudetDetailsApplication.class, args);
        System.out.println("\n--- SERVER RUNNING: http://localhost:8080/api/students ---\n");
    }

    @Bean
    CommandLineRunner initDatabase(Studentrepository repository) {
        return args -> {
            Student s = new Student();
            s.setName("Sneha");
            s.setEmail("sneha@example.com");
            repository.save(s);
        };
    }
}