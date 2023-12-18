package org.computerworkshop.universityproject.service;

import org.computerworkshop.universityproject.data.model.Student;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();
    Optional<Student> findOne(long id) throws ChangeSetPersister.NotFoundException;
    Student update(long id, Student newStudent) throws ChangeSetPersister.NotFoundException;
    Student save(Student student);
    void delete(long id) throws ChangeSetPersister.NotFoundException;
}
