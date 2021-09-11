package com.codecourse.onetoone.service;

import com.codecourse.onetoone.model.Instructor;
import com.codecourse.onetoone.repository.InstructorDetailRepository;
import com.codecourse.onetoone.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;
    @Autowired
    private InstructorDetailRepository instructorDetailRepository;

    //    Getting All Instructor
    public List<Instructor> getAllInstructor(){
       return   instructorRepository.findAll();
    }

//    Add a instructor
    public void addInstructor(Instructor instructor){
        instructorRepository.save(instructor);
    }
}
