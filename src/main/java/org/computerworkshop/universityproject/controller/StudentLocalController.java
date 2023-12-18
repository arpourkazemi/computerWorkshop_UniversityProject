package org.computerworkshop.universityproject.controller;

import lombok.AllArgsConstructor;
import org.computerworkshop.universityproject.data.model.Student;
import org.computerworkshop.universityproject.service.StudentLocalService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/students")
public class StudentLocalController {
    private StudentLocalService studentLocalService;

    @GetMapping()
    public List<Student> findAll(){
        return studentLocalService.findAll();
    }

    @PostMapping()
    public Student save(Student student){
        return studentLocalService.save(student);
    }

    @GetMapping("/{id}")
    public Optional<Student> findOne(@PathVariable long id) throws ChangeSetPersister.NotFoundException {
        return studentLocalService.findOne(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) throws ChangeSetPersister.NotFoundException {
        studentLocalService.delete(id);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable long id, @RequestBody Student newStudent) throws ChangeSetPersister.NotFoundException {
        return studentLocalService.update(id, newStudent);
    }
}
