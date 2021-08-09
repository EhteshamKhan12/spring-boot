package com.example.demo.student;

import java.time.LocalDate;

/**
 * Created by Win10 on 8/8/2021.
 */
public class Student {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate date;

    public Student() {

    }

    public Student(Long id, String name, String email, Integer age, LocalDate date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.date = date;
    }

    public Student(String name, String email, Integer age, LocalDate date) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
