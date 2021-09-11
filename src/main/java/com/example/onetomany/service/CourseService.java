package com.example.onetomany.service;

import com.example.onetomany.model.Course;
import com.example.onetomany.model.Instructor;
import com.example.onetomany.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }
    public List<Course> getCourseById(Long courseId){
        return courseRepository.findAllById(courseId);
    }
    public Course getSingleCourseByID(Long id){return courseRepository.getById(id);}
    public List<Course> AllCourse(){
        return courseRepository.findAll();
    }

}

