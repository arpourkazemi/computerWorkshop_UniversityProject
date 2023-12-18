package org.computerworkshop.universityproject.data.repository;

import lombok.NoArgsConstructor;
import org.computerworkshop.universityproject.data.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
