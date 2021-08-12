package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Win10 on 8/8/2021.
 */
@RestController
@RequestMapping(path = "api/vi/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student)
    {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deletestudet(@PathVariable("studentId")Long studentId){
        studentService.deleteStudent(studentId);

    }
    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId")Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email)
    {
        studentService.updateStudent(studentId, name, email);
    }
}
