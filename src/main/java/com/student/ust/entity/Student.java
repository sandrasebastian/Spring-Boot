package com.student.ust.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name="student_ust_identitymappedby")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Student_id;
    private int rollNo;
    private  String name;
    private int age;;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="student")
@Column(name="book_id")
    private Set<Book> bookSet;





}
