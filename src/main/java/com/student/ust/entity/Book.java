package com.student.ust.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="book_ust_details")
public class Book {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int bookId;
private String bookName;
private String authorName;
private long isbnNumber;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;

}




