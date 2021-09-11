package com.codecourse.onetoone.controller;

import com.codecourse.onetoone.model.Instructor;
import com.codecourse.onetoone.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InstructorController {
    @Autowired
    private InstructorService instructorService;

    @RequestMapping(value = "/GetAllinstructor")
    public List<Instructor> getAllInstruc(){
        return instructorService.getAllInstructor();
    }

   @PostMapping(value = "/instructorAdd")
    public void addStudent(@RequestBody Instructor instructor) {
        instructorService.addInstructor(instructor);
    }
}
