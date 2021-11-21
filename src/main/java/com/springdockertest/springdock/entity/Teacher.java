package com.springdockertest.springdock.entity;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Teacher {

    @Id
    @SequenceGenerator(name = "teacher_sequence",sequenceName = "teacher_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "teacher_sequence")
    private long teacherId;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    @Column(name = "email_address")
    private String emailID;

    @OneToMany(
           cascade = CascadeType.ALL

    )
    @JoinColumn(name = "teacher_id",referencedColumnName ="teacherId" )
    private List<Course> course;

}
