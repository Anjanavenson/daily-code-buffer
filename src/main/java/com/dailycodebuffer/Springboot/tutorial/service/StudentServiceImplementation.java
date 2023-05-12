package com.dailycodebuffer.Springboot.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.entity.Student;
import com.dailycodebuffer.Springboot.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImplementation implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        Student save = studentRepository.save(student);
        return save;
    }
}
