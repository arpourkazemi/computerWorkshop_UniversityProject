package org.computerworkshop.universityproject.controller;

import lombok.AllArgsConstructor;
import org.computerworkshop.universityproject.data.model.Student;
import org.computerworkshop.universityproject.service.StudentLocalService;
import org.computerworkshop.universityproject.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentLocalService studentLocalService;

    @GetMapping()
    public List<Student> findAll(){
        return studentLocalService.findAll();
    }

    @PostMapping()
    public Student save(Student student){
        return studentLocalService.save(student);
    }
}
