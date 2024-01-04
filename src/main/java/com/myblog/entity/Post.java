package com.myblog.entity;

import jakarta.persistence.*;
import lombok.*;


import javax.annotation.processing.Generated;

@Entity
//@Data
@Setter
@Getter
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String content;
}
