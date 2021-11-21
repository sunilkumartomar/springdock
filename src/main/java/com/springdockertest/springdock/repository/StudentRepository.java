package com.springdockertest.springdock.repository;

import com.springdockertest.springdock.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("from Student s")
    List<Student> getAllStudent();

    //@Query("SELECT s from Student s where s.studentName =:name")
    List<Student> findStudentByStudentName(String name);

    List<Student> findStudentByStudentNameContaining(String studentName);

    List<Student> findStudentByStudentNameNotNull();

    List<Student> findStudentByGuardian_GuardianName(String name);

    //JPQL
    @Query("select s from Student s where s.emailId=?1")
    String getByStudentNameEmailId(String email);

    //Native query
    @Query(value = "select s from student_details s where s.email_address", nativeQuery = true)
    String getStudentByEmailIdNative(String email);


    //Native and named parameter
    @Query(value = "select s from student_details s where s.email_address", nativeQuery = true)
    String getStudentByEmailIdNativeNamedParam(@Param("email_address") String email);


    @Modifying  //for modifying database
    @Transactional   //transaction required for modifying records or delete
    @Query(value = "update student_details set student_name=?1 where email_address=?2", nativeQuery = true)
    int updateStudentByEmailId(String studentName, String emailId);

}

