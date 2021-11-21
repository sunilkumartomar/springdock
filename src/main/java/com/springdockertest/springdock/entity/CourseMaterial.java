package com.springdockertest.springdock.entity;


import lombok.*;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course_material")
@ToString(exclude = "course")
public class CourseMaterial {

    @Id
    @SequenceGenerator(name = "course_material_sequence", sequenceName = "course_material_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_material_sequence")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private long courseMaterialId;
    private String courseMaterialUrl;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id",
            referencedColumnName = "courseId")
    private Course course;
}
