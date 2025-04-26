package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.*;

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student mariam = new Student(
//                    "Hashim",
//                    "hashim@mail.com",
//                    LocalDate.of(2000, JANUARY + 1, 5),
//                    25
//            );
//
//            Student ayoub = new Student(
//                    "Ayoub",
//                    "ayoub@mail.com",
//                    LocalDate.of(2000, JUNE + 1, 17),
//                    24
//            );
//
//            Student nassim = new Student(
//                    "Nassim",
//                    "nassim@mail.com",
//                    LocalDate.of(1999, MARCH + 1, 22),
//                    26
//            );
//
//            repository.saveAll(
//                    List.of(mariam, ayoub, nassim)
//            );
//        };
//    }
}
