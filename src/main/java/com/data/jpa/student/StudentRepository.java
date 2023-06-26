package com.data.jpa.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findByFirstName(String name);

    List<Student> findByFirstNameContaining(String name);

    List<Student> findByGuardianName(String name);

    //JPQL
    @Query("select s from Student s where s.emailAddress = ?1")
    Student getStudentWithQuery(String emailId);

    @Query(value = "select * from Student s where s.emailAddress = ?1",
            nativeQuery = true
    )
    Student useNativeQuery(String emailAddress);



}
