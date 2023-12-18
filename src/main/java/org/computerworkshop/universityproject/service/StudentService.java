package org.computerworkshop.universityproject.service;

import org.computerworkshop.universityproject.data.model.Student;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findOne(long id) throws ChangeSetPersister.NotFoundException;
    Student update(long id, Student newStudent) throws ChangeSetPersister.NotFoundException;
    Student save(Student student);
    void delete(long id) throws ChangeSetPersister.NotFoundException;
}
