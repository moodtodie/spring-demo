package com.github.moodtodie.springdemo.service;


import com.github.moodtodie.springdemo.entity.Student;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class StorageService {
    private List<Student> storage = new ArrayList<Student>();

    public List<Student> getStorage() {
        return storage;
    }

    public boolean add(Student student) {

        for (int i = 0; i < storage.size(); ++i) {
            if (student.getStudentId() == storage.get(i).getStudentId()) {
                return false;
            }
        }
        storage.add(student);
        return true;
    }
}
