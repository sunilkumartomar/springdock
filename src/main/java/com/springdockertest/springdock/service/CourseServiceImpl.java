package com.springdockertest.springdock.service;

import com.springdockertest.springdock.entity.Course;
import com.springdockertest.springdock.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {


    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course getCourse(Long id) {
        return null;
    }

    @Override
    public Course saveCourse(Course course) {
        System.out.print(course);
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getCourseList() {
        return courseRepository.findAll();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }
}
