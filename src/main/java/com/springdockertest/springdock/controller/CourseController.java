package com.springdockertest.springdock.controller;

import com.springdockertest.springdock.entity.Course;
import com.springdockertest.springdock.service.CourseService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved list"),
        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
}
)
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/course")
    public String courseHome() {

        return "welcome to the course tutorial/commit";
    }

    @PostMapping("/course")
    public Course addCourse(@RequestBody String course) {
        System.out.print("course add called");
        System.out.print("Sunil "+course);
        return null;
    }

    @GetMapping("/courses")
    public List<Course> getCourse(){
        System.out.print("get course called");
        return courseService.getCourseList();
    }

}
