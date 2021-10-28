package com.github.moodtodie.springdemo.service;


import com.github.moodtodie.springdemo.entity.Student;
import com.github.moodtodie.springdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStorage() {
        return (List<Student>) studentRepository.findAll();
    }

    public boolean add(Student student) {
        if (studentRepository.existsByStudentId(student.getStudentId())) {
            return false;
        } else {
            studentRepository.save(student);
            return true;
        }
    }
}
