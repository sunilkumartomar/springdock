package com.springdockertest.springdock.service;

import com.springdockertest.springdock.entity.Student;
import com.springdockertest.springdock.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    public StudentServiceImpl() {
    }

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudent(Long id) {
        return studentRepository.getById(id);
    }

    @Override
    public List<Student> getStudentList(Student student) {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {

    }
//    @Override
//    public List<Flipkart> getData() {
//
//        return null;
//    }
}
