package org.computerworkshop.universityproject.controller;

import lombok.AllArgsConstructor;
import org.computerworkshop.universityproject.data.model.Student;
import org.computerworkshop.universityproject.service.StudentDatabaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentDatabaseService studentDatabaseService;

    @GetMapping()
    public List<Student> findAll(){
        return studentDatabaseService.findAll();
    }

    @PostMapping()
    public Student save(Student student){
        return studentDatabaseService.save(student);
    }

    @GetMapping("/{id}")
    public Optional<Student> findOne(@PathVariable long id) {
        return studentDatabaseService.findOne(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        studentDatabaseService.delete(id);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable long id, @RequestBody Student newStudent) {
        return studentDatabaseService.update(id, newStudent);
    }
}
