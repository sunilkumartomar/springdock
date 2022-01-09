package com.springdockertest.springdock.repository;

import com.springdockertest.springdock.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    CourseRepository courseRepository;

    @Test
    public void printCourse() {

        List<Course> courseList = courseRepository.findAll();
        System.out.println("Cousrse List" + courseList);
    }

    @Test
    public void printCourseWithCourseMaterial() {

        List<Course> courseList = courseRepository.findAll();
        System.out.println("Cousrse List" + courseList);
    }
}