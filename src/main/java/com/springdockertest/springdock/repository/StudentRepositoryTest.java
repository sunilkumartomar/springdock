package com.springdockertest.springdock.repository;


import com.springdockertest.springdock.entity.Guardian;
import com.springdockertest.springdock.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void svaeStudent() {
        Student student = Student.builder().emailId("suniltomar145gmail.com")
                .studentName("Sunil").mobileNumber("9624902007")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {


        Guardian guardian = Guardian.builder().guardianName("ygwendra tomar")
                .guardianEmail("yogendra")
                .guardianMobile("9624902007")
                .build();

        Student student = Student.builder()
                .studentName("Sunil")
                .mobileNumber("9624902007")
                .emailId("suniltomar142@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {

        List<Student> stduentList = studentRepository.findAll();
        System.out.println(stduentList);
    }

    @Test
    public void printStudentByName() {

        List<Student> studentList = studentRepository.findStudentByStudentName("yogendra");
        System.out.println("Student=" + studentList);
    }

    @Test
    public void printStudentNameContaining() {

        List<Student> studentList = studentRepository.findStudentByStudentNameContaining("n");
        System.out.println("Student=" + studentList);
    }

    @Test
    public void printStudentByStudentNameNotNull() {

        List<Student> studentList = studentRepository.findStudentByStudentNameNotNull();
        System.out.println("Student=" + studentList);
    }

    @Test
    public void printStudentByGuardian_GuardianName() {

        List<Student> studentList = studentRepository.findStudentByGuardian_GuardianName("sudhusingh");
        System.out.println("Student=" + studentList);
    }

    @Test
    public void updateStudentNameByEmailId() {

        int updatedRows = studentRepository.updateStudentByEmailId("Sunil Singh","suniltomar142@gmail.com");
        System.out.println(updatedRows);
    }
}
