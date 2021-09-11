package com.example.onetomany.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Instructor")
@NoArgsConstructor
@ToString
@Data
@AllArgsConstructor
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "instructor",cascade = {CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH,CascadeType.DETACH})
    private List<Course> courses;

//Add convenient methdods for bi-directional relationship
    public Instructor add(Course tempCourse){
        if (courses == null){
            courses =new ArrayList<>();
        }
        courses.add(tempCourse);
        return null;
    }

}

