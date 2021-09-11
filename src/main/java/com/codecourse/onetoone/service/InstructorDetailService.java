package com.codecourse.onetoone.service;

import com.codecourse.onetoone.model.InstructorDetail;
import com.codecourse.onetoone.repository.InstructorDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InstructorDetailService {
    @Autowired
    private InstructorDetailRepository instructorDetailRepository;

    public void addInstructorDetail(InstructorDetail instructorDetail){
        instructorDetailRepository.save(instructorDetail);

    }

    public List<InstructorDetail> getAllInstructor(){
        List<InstructorDetail> instructorDetails = new ArrayList<>();
        instructorDetailRepository.findAll().forEach(instructorDetails::add);
        return  instructorDetails;
    }


    public Optional<InstructorDetail> getAllInstructorByID(Long id) {
        return   instructorDetailRepository.findById(id);
    }
}
