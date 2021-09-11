package com.example.onetomany.service;

import com.example.onetomany.model.Course;
import com.example.onetomany.model.Instructor;
import com.example.onetomany.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {
    @Autowired
    private InstructorRepository instructorRepository;
    public Instructor saveInstructor(Instructor instructor){
     return instructorRepository.save(instructor);
    }
    public Instructor getInstructorById(Long instructor){
       return instructorRepository.getById(instructor);
    }

    public List<Instructor> AllInstructor(){
        return instructorRepository.findAll();
    }

    public Instructor addCourse(Course courseById, Instructor data) {
        return data.add(courseById);
    }
}
