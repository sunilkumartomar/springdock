package com.springdockertest.springdock.repository;

import com.springdockertest.springdock.entity.Course;
import com.springdockertest.springdock.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial() {

        Course course = Course.builder().title("Java").credit(5).build();
        CourseMaterial courseMaterial = CourseMaterial.builder().courseMaterialUrl("https://w3schooll.com").course(course).build();
        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public void printCourseMaterial() {

        List<CourseMaterial> courseMaterialList = courseMaterialRepository.findAll();
        System.out.println("Course lIst: "+courseMaterialList);
    }

}