package com.data.jpa.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest //data base won't be impacted, it will create data and flush
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Guardian guardian = Guardian.builder()
                .name("Alom")
                .email("alom@gmail.com")
                .mobile("00000000000")
                .build();

        Student student = Student.builder()
                .firstName("Rakib")
                .lastName("Hasan")
                .emailAddress("hasanbappi@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void findByFirstName() {
        List<Student> students = studentRepository.findByFirstName("Rakib");
        System.out.println(students);
    }

    @Test
    public void findByFirstNameContaining() {
        List<Student> students = studentRepository.findByFirstNameContaining("ak");
        System.out.println('\n');
        System.out.println(students);
    }

    @Test
    public void findByGuardianName() {
        List<Student> students = studentRepository.findByGuardianName("Alom");
        System.out.println('\n');
        System.out.println(students);
    }

    @Test
    public void getStudentWithQuery() {
        Student student = studentRepository.getStudentWithQuery("hasanbappi@gmail.com");
        System.out.println('\n');
        System.out.println(student);
    }

    @Test
    public void useNativeQuery() {
        Student student = studentRepository.useNativeQuery("hasanbappi@gmail.com");
        System.out.println('\n');
        System.out.println(student);
    }

}