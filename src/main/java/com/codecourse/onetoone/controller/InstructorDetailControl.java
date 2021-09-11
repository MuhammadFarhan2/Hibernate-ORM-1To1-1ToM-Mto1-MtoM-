package com.codecourse.onetoone.controller;

import com.codecourse.onetoone.model.InstructorDetail;
import com.codecourse.onetoone.service.InstructorDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstructorDetailControl {
    @Autowired
    private InstructorDetailService instructorDetailService;

    @GetMapping(value = "/DetailInstructor")
    public List<InstructorDetail> instructorDetails(){
        return instructorDetailService.getAllInstructor();
    }

   @GetMapping(value = "/DetailInstructorById{id}")
    public InstructorDetail instructorDetailByID(@PathVariable Long id){
        return instructorDetailService.getAllInstructorByID(id).orElse(null);
    }

    @PostMapping(value = "/instructorDetailAdd")
    public void addStudent(@RequestBody InstructorDetail instructor) {
        instructorDetailService.addInstructorDetail(instructor);
    }
}
