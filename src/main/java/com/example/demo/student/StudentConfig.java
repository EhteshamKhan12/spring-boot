package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import static java.time.Month.*;

/**
 * Created by Win10 on 8/10/2021.
 */
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "mariam", "mariam@gmail.com",

                    LocalDate.of(2000, JANUARY, 5)

            );
            Student ehtesham = new Student(
                    "ehtesham", "ehtesham@gmail.com",

                    LocalDate.of(2001, FEBRUARY, 5)

            );

            repository.saveAll(
                    Arrays.asList(mariam,
                            ehtesham)
            );

        };
    }
}


