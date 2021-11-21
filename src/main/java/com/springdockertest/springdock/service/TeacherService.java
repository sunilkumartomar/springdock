package com.springdockertest.springdock.service;


import com.springdockertest.springdock.entity.Teacher;

import java.util.List;

public interface TeacherService {

     Teacher getTeacher(Long id);
     Teacher saveTeacher(Teacher teacher);
     List<Teacher> getTeacherList();
     void delete(Long id);
     Teacher updateTeacher(Teacher teacher);

}
