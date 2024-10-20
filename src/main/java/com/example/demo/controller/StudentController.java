package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> students = new ArrayList<>(
            List.of(
                    new Student(1, "Navin", 60),
                    new Student(2, "Kiran", 65)
            ));


    @GetMapping("/getStudent")
    public List<Student> getStudents() {
        return students;
    }


    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

}
