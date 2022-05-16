package com.project.zanarkand.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
public class Category extends IdClass{

    private String title;
    private String image;
    private String status;

}
