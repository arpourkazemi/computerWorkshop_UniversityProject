package org.computerworkshop.universityproject.service;

import lombok.AllArgsConstructor;
import org.computerworkshop.universityproject.data.model.Student;
import org.computerworkshop.universityproject.data.repository.StudentRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentDatabaseService implements StudentService{
    private final StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findOne(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student update(long id, Student newStudent) throws ChangeSetPersister.NotFoundException {
//        Optional<Student> studentToFind = this.findOne(id);
//        studentToFind = Optional.ofNullable(newStudent);
//        this.save(studentToFind);
        return null;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(long id){
        studentRepository.deleteById(id);
    }
}
