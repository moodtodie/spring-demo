package com.github.moodtodie.springdemo.repository;

import com.github.moodtodie.springdemo.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    boolean existsByStudentId(Long studentId);
}
