package com.example.onetomany.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "Course")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;
}
