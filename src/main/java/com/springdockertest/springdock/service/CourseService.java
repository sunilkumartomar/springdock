package com.springdockertest.springdock.service;

import com.springdockertest.springdock.entity.Course;
import com.springdockertest.springdock.entity.Teacher;

import java.util.List;

public interface CourseService {

    Course getCourse(Long id);
    Course saveCourse(Course course);
    List<Course> getCourseList();
    void delete(Long id);
    Course updateCourse(Course course);
}
