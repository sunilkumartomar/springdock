package com.springdockertest.springdock.entity;


import lombok.*;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
@Table(name = "student_details",
        uniqueConstraints = @UniqueConstraint(name = "emailid_unique", columnNames = "email_address"))

public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")

    private long studentId;
    private String studentName;
    private String mobileNumber;
    @Column(name = "email_address", nullable = false)
    private String emailId;

    @Embedded
    private Guardian guardian;
}
