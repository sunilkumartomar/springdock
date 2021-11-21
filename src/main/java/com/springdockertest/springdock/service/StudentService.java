package com.springdockertest.springdock.service;

import com.springdockertest.springdock.entity.Student;

import java.util.List;

public interface StudentService {
    Student getStudent(Long id);

    List<Student> getStudentList(Student student);

    Student saveStudent(Student student);

    void deleteStudent(Long id);

    //public List<Flipkart> getData();
}
