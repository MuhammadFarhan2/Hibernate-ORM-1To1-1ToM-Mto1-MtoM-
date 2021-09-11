package com.example.onetomany.repository;

import com.example.onetomany.model.Course;
import com.example.onetomany.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    List<Course> findAllById(Long courseId);
}
