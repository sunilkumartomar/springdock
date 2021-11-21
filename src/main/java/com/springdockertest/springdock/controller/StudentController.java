package com.springdockertest.springdock.controller;


import com.springdockertest.springdock.entity.Student;
import com.springdockertest.springdock.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String hello() {

        return "welcome to the spring with dock project";
    }
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") String id) {
        return studentService.getStudent(Long.parseLong(id));
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody() Student student) {

        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getStudentList(@RequestBody Student student) {
        return studentService.getStudentList(student);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("id") String id) {
        studentService.deleteStudent(Long.parseLong(id));

        return null;
    }


}
