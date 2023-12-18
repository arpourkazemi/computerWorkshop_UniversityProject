package org.computerworkshop.universityproject.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.computerworkshop.universityproject.data.model.Student;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class StudentLocalService implements StudentService{
    List<Student> students = new ArrayList<>();

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public Optional<Student> findOne(long id) throws ChangeSetPersister.NotFoundException {
        Student oneToFind = null;
        for (Student student : students) {
            if (student.getId() == id) {
                oneToFind = student;
                return Optional.of(oneToFind);
            }
        }
        throw new ChangeSetPersister.NotFoundException();
    }

    @Override
    public Student update(long id, Student newStudent) throws ChangeSetPersister.NotFoundException {
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getId() == id){
                students.set(i, newStudent);
                return newStudent;
            }
        }
        throw new ChangeSetPersister.NotFoundException();
    }

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public void delete(long id) throws ChangeSetPersister.NotFoundException {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return;
            }
        }
        throw new ChangeSetPersister.NotFoundException();
    }
}
