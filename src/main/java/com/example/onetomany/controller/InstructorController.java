package com.example.onetomany.controller;

import com.example.onetomany.model.Course;
import com.example.onetomany.model.Instructor;
import com.example.onetomany.service.CourseService;
import com.example.onetomany.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstructorController {
    @Autowired
    private InstructorService instructorService;

    @Autowired
    private CourseService courseService;


    @PostMapping("/saveInstructor")
    public Instructor add(@RequestBody Instructor data,@PathVariable Long courseId){
        Course courseById = this.courseService.getSingleCourseByID(courseId);
        this.instructorService.addCourse(courseById,data);
        instructorService.saveInstructor(data);
        return data;
    }
    @GetMapping("/AllInstructor")
    public List<Instructor> allData(){
       return instructorService.AllInstructor();
    }

    @GetMapping("/getInstructorById/{id}")
    public Instructor getInstructorById(@PathVariable Long id){
       return instructorService.getInstructorById(id);
    }

    @PostMapping("/saveCourse")
    public Course saveCourse(@RequestBody  Course data){
        return courseService.saveCourse(data);
    }
    @GetMapping("/AllCourse")
    public List<Course> AllCourse(){
       return courseService.AllCourse();
    }

    @GetMapping("/getCourseById/{id}")
    public List<Course> getCourseById(@PathVariable Long id){
       return courseService.getCourseById(id);
    }
}
