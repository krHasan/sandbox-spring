package com.data.jpa.student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    @Id
    @SequenceGenerator(name = "student_sec", sequenceName = "student_sec", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sec")
    private Long id;
    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String emailAddress;

    @Embedded
    private Guardian guardian;

}
