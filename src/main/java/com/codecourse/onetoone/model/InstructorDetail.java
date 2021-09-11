package com.codecourse.onetoone.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "InstructorDetail")
public class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long   id;

    @Column(name = "youtube_channael")
    private  String youtubeChannel;

    @Column(name = "hobby")
    private  String hobby;

    @Autowired
    @OneToOne(mappedBy = "instructorDetail",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Instructor instructor;

}
