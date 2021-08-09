package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Win10 on 8/8/2021.
 */
@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudents() {
        return Arrays.asList(new Student(1L,
                        "mariam", "mariam@gmail.com",
                        18,
                        LocalDate.of(2000, Month.JANUARY, 5)
                )
        );
    }
}
